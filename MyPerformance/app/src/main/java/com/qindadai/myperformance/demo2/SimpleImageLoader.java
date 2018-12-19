package com.qindadai.myperformance.demo2;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.widget.ImageView;

/**
 * Created by Alex
 * time: 2018/12/17  5:02 PM
 * Description: This is SimpleImageLoader
 * Func for
 */
public class SimpleImageLoader {

    private static SimpleImageLoader mLoader;

    private LruCache<String, Bitmap> mLruCache;

    public static SimpleImageLoader getInstance() {
        if (mLoader == null) {
            synchronized (SimpleImageLoader.class) {
                if (mLoader == null) {
                    mLoader = new SimpleImageLoader();
                }
            }
        }
        return mLoader;
    }

    /***
     * 初始化 缓存对象
     */
    public SimpleImageLoader() {
        int maxSize = (int) Runtime.getRuntime().maxMemory() / 8;
        mLruCache = new LruCache<String, Bitmap>(maxSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getByteCount();
            }
        };
    }

    /***
     * 用来加载网络图片
     * @param view
     * @param url
     */
    public void displayImage(ImageView view, String url) {
        Bitmap bitmap = getBitmapFromCache(url);
        if (bitmap != null) {
            view.setImageBitmap(bitmap);
        } else {
            downloadImage(view , url);
        }

    }

    private void downloadImage(ImageView view, String url) {

    }

    /***
     * 从缓存读取图片
     * @param url
     * @return
     */
    private Bitmap getBitmapFromCache(String url) {
        return mLruCache.get(url);
    }

    /***
     * 加入缓存
     * @param bitmap
     * @param url
     */
    private void putBitmapToCache(Bitmap bitmap, String url) {
        if (bitmap != null) {
            mLruCache.put(url, bitmap);
        }
    }




}

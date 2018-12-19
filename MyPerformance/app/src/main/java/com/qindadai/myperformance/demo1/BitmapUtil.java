package com.qindadai.myperformance.demo1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Alex
 * time: 2018/12/17  4:36 PM
 * Description: This is BitmapUtil
 * Func for
 */
public class BitmapUtil {

    public static Bitmap ratio(String filepath, int pixelW, int pixelH) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;      // 只加载边界
        options.inPreferredConfig = Bitmap.Config.RGB_565;

        BitmapFactory.decodeFile(filepath , options);

        int originalW = options.outWidth;
        int originalH = options.outHeight;
//        重采样
        options.inSampleSize = getSimpleSize(originalW , originalH , pixelW ,pixelH);
        options.inJustDecodeBounds  =false;

        return BitmapFactory.decodeFile(filepath ,options);
    }

    //采样率
    private static int getSimpleSize(int originalW, int originalH, int pixelW, int pixelH) {

        int simpleSize = 1; //采样率为1
        if (originalW > originalH && originalW > pixelW){
        // 原始宽度 > 原始高度  并且 原始宽度 > 采样宽度 以宽度计算采样率
            simpleSize = originalW / pixelW;
        }else if(originalW < originalH && originalH > pixelH){

            simpleSize = originalH / pixelH;
        }
        if (simpleSize <= 0){
            simpleSize = 1;
        }
        return simpleSize;
    }
}

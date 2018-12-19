package com.qindadai.myperformance.demo2;

import android.content.Context;

import java.io.File;
import java.io.IOException;

import libcore.io.DiskLruCache;

/**
 * Created by Alex
 * time: 2018/12/18  7:26 PM
 * Description: This is DiskLruCacheHelper
 * Func for
 */
public class DiskLruCacheHelper {
    private static final String dir_name = "diskCache";
    private static final int MAX_COUNT = 5 * 1024 * 1204;
    private static final int DEFAULT_APP_VERSION = 1;

    private static final String TAG = "DiskLruCacheHelper";


    public DiskLruCacheHelper(Context context) throws IOException{

    }
    public DiskLruCacheHelper(Context context ,String dirName) throws IOException{

    }
    public DiskLruCacheHelper(Context context ,String dirName ,int MAX_COUNT) throws IOException{

    }
    public DiskLruCacheHelper(File dir) throws IOException{
//        mDiskLruCache = ge
    }
    public DiskLruCacheHelper(Context context ,File dir) throws IOException{

    }
    public DiskLruCacheHelper(Context context ,File dir ,int maxCount) throws IOException{

    }

    private DiskLruCache generateCache(Context context , File dir , int maxCount)throws IOException{
            if (!dir.exists()){
//                throw new IllegalArgumentException(dir + )
            }
            return null;
    }

}

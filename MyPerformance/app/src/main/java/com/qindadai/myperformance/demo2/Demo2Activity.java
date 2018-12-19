package com.qindadai.myperformance.demo2;

import android.support.constraint.solver.Cache;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;

import com.qindadai.myperformance.R;

import java.security.Key;

import libcore.io.DiskLruCache;

/**
 * Created by Alex
 * time: 2018/12/17  4:53 PM
 * Description: This is Demo2Activity
 * Func for 缓存
 */
public class Demo2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        test();
    }

    private void test() {
        //缓存 应用点
//        1.不经常变化的数据 直接用本地缓存
//                2.不在频繁请求服务器 ，降低服务器压力
//                3.一些特殊场景 --- 离线阅读 无网络情况下

        /***
         * 常用缓存策略
         *
         * android lruCache
         *
         * DiskLruCache
         *
         * Sqlite (不重要) 主要用来持久化数据
         *
         */

        lrucache();
        dislrucache();
    }

    private void dislrucache() {
        //DiskLruCache
//        DiskLruCache.open()
//        有外置存储时 /sdcard/ Android/data/<app>/Cache
//        无外置存储时 /data/data/Android/data/<app>/Cache

//        Key 必须时英文字母

        //外观模式 ---推荐书 android源码设计模式



    }

    private void lrucache() {
        //原理
        //近期最少使用算法
        //linkedHashMap
        //取代soft—Reference

        // 注意问题
        // 用v4包 lrucache
        //动态调整大小    todo



    }
}

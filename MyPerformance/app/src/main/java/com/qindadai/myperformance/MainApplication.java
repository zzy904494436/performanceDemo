package com.qindadai.myperformance;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Alex
 * time: 2018/12/17  4:21 PM
 * Description: This is MainApplication
 * Func for
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initApp();
    }

    private void initApp() {
        // 初始化 arouter
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);


    }


    public Application getApplication() {
        return this;
    }
}

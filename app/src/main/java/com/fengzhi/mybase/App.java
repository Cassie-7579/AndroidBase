package com.fengzhi.mybase;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by admin on 2018/5/30.
 */

public class App extends Application {

    public static App instance = null;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        /**
         * 当加入的外部库太多的时候导致dex文件大于64k在Android 4.4手机上出现分包问题，
         * 这个时候需要这个MultiDex
         */
        MultiDex.install(this);
    }

    public static App getInstance() {
        if (instance == null) {
            synchronized (App.class) {
                //同步
                if (instance == null) {
                    instance = new App();
                }
            }
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;


        //做一下初始化操作 例如初始化日志框架 数据库框架

    }

}

package com.fengzhi.mybase.base;

/**
 * Created by Nicholas on 2016/10/30.
 */

public interface BaseView {

    /**
     * 显示动态加载
     */
    void showLodding(String message);

    /**
     * 显示错误信息
     */
    void showError(String error);

    /**
     * 隐藏动态加载
     */
    void onHideLodding();
}
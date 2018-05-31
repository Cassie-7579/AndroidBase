package com.fengzhi.mybase.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.fengzhi.mybase.config.AppManager;

import butterknife.Unbinder;

/**
 * Author: cassie
 * Date: 2018/05/30
 * Dec: Activity的基础类
 * Version: 1.0
 * Created by admin on 2018/5/30.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;
    protected ProgressDialog progressDialog;
    protected Toast toast;
    protected Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局
        setContentView(getLayoutResId());
        //将当前activity加入到activity管理器中
        AppManager.getInstance().addActivity(this);
        mContext = this;
        //初始化一个Toast，避免多次弹出toast
        toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        //禁止横屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //页面初始化调用
        initView(savedInstanceState);
        //沉浸式状态栏  只有4.4以上的Android版本才可以设置
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    /**
     * 显示加载对话框
     *
     * @param message
     */
    protected void showLoadingDialog(String message) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(mContext);
        }
        progressDialog.setMessage(message);
        if (!isFinishing()) {
            progressDialog.show();

        }
        progressDialog.setCancelable(false);
    }

    /**
     * 显示加载对话框
     */
    protected void showLoadingDialog(String message, boolean cancelable) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(mContext);
        }
        progressDialog.setMessage(message);
        if (!isFinishing()) {
            progressDialog.show();
        }
        progressDialog.setCancelable(cancelable);
    }

    /**
     * 隐藏加载对话框
     */
    protected void dismissLoadingDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    /**
     * 提示框
     */
    protected void SToast(String message) {
        synchronized (mContext) {
            toast.cancel();
            toast = Toast.makeText(mContext, message, Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /**
     * 提示框(中间)
     */
    protected void CToast(String message) {
        synchronized (mContext) {
            toast.cancel();
            toast = Toast.makeText(mContext, message, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    protected void startActivity(Class<?> activity, Bundle bundle, boolean isFinish) {
        Intent intent = new Intent();
        intent.setClass(mContext, activity);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
        if (isFinish) {
            finish();
        }
    }


    protected void startActivityForResult(Class<?> activity, Bundle bundle, int requestCode,
                                          boolean isFinish) {
        Intent intent = new Intent();
        intent.setClass(mContext, activity);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
        if (isFinish) {
            finish();
        }
    }

    @Override
    public void finish() {
        super.finish();
    }

    /**
     * 隐藏键盘
     */
    public void unkeyboard() {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context
                    .INPUT_METHOD_SERVICE);
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(((Activity) mContext).getCurrentFocus
                        ().getWindowToken(), 0);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /**
     * 提供给toolbar 的back 放回事件
     */
    public void backfinish(View view) {
        finish();
        unkeyboard();
    }

    public Context getContext() {
        return mContext;
    }

    @Override
    protected void onDestroy() {
        //解绑ButterKnife
        unbinder.unbind();
        super.onDestroy();
    }

    protected abstract void initView(@Nullable Bundle savedInstanceState);  //初始化

    protected abstract int getLayoutResId();  //加载布局文件
}

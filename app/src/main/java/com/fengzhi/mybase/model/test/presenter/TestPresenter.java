package com.fengzhi.mybase.model.test.presenter;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.fengzhi.mybase.bean.SupplierDataBean;
import com.fengzhi.mybase.model.test.contract.TestContract;
import com.fengzhi.mybase.model.test.model.TestModel;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2018/5/30.
 */

public class TestPresenter extends TestContract.Presenter {

    public TestPresenter(TestContract.View view) {
        mView = view;
        mModel = new TestModel();
    }

    @Override
    public void doTest() {

        final Subscription subscribe = mModel.doTest()
                //设置事件触发在非主线程
                .subscribeOn(Schedulers.io())
                //设置事件接受在UI线程以达到UI显示的目的
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<SupplierDataBean>() {
                    /**
                     * 启动请求
                     */
                    @Override
                    public void onStart() {
                        super.onStart();
                        mView.showLodding("正在加载...");
                    }

                    /**
                     * 请求结束
                     */
                    @Override
                    public void onCompleted() {
                        mView.onHideLodding();
                    }

                    /**
                     * 请求错误
                     * @param e
                     */
                    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    /**
                     * 请求成功
                     * @param dataBeans
                     */
                    @Override
                    public void onNext(SupplierDataBean dataBeans) {
                        //请求成功操作
                        if (dataBeans.getErrcode() == 0) mView.getDataSuccess(dataBeans.getData());
                        else mView.showError(dataBeans.getMessage());
                    }
                });
        addSubscribe(subscribe);
    }

}

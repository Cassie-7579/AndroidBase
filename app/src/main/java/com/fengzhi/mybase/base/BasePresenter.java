package com.fengzhi.mybase.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Cassie on 2018/05/30
 */

public class BasePresenter<V extends BaseView, M extends BaseModel> {

    protected V mView;
    protected M mModel;

    /**
     * 使用CompositeSubscription来防止OOM
     * 因为在网络请求的时候可能activity或者fragment已经被销毁，然后网络请求还在执行
     */
    private CompositeSubscription mCompositeSubscription;

    protected void addSubscribe(final Subscription subscription) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (mCompositeSubscription == null) {
                    mCompositeSubscription = new CompositeSubscription();
                }
                mCompositeSubscription.add(subscription);
            }
        }).start();

    }

    public void unSubscribe() {
        if (mView != null) {
            mView = null;
        }
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.clear();
        }
    }

}

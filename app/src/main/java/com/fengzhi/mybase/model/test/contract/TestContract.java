package com.fengzhi.mybase.model.test.contract;

import com.fengzhi.mybase.base.BaseModel;
import com.fengzhi.mybase.base.BasePresenter;
import com.fengzhi.mybase.base.BaseView;
import com.fengzhi.mybase.bean.SupplierDataBean;

import java.util.List;

import rx.Observable;

/**
 * 一个契约类
 * 通过这个来写View和Model中的接口类内容并放到presenter中
 * 形成MVP
 * Created by admin on 2018/5/30.
 */

public interface TestContract {

    /**
     * View接口类
     */
    interface View extends BaseView{
        /**
         * 请求成功
         */
        void getDataSuccess(List<SupplierDataBean.DataBean> dataBeans);
    }

    /**
     * Model接口类
     */
    interface Model extends BaseModel{
        Observable<SupplierDataBean> doTest();
    }

    /**
     * Presenter静态类
     */
    abstract class Presenter extends BasePresenter<View,Model>{
        public abstract void doTest();
    }
}

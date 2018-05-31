package com.fengzhi.mybase.model.test.model;

import com.fengzhi.mybase.api.ApiEngine;
import com.fengzhi.mybase.bean.SupplierDataBean;
import com.fengzhi.mybase.model.test.contract.TestContract;

import java.util.List;

import rx.Observable;

/**
 * Created by admin on 2018/5/30.
 */

public class TestModel implements TestContract.Model {

    @Override
    public Observable<SupplierDataBean> doTest() {
        return ApiEngine.getInstance().getApiService().doTest();
    }
}

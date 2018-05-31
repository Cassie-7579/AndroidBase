package com.fengzhi.mybase.api;

import com.fengzhi.mybase.bean.SupplierDataBean;
import com.fengzhi.mybase.constant.Constant;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Cassie on 2018/05/30.
 */

public interface ApiService {

    String BASE_URL = Constant.BASE_URL;

    @GET(Constant.GET_SUPPLIER)
    Observable<SupplierDataBean> doTest();

    @GET(Constant.GET_SUPPLIER)
    Call<SupplierDataBean> doTest1();
}

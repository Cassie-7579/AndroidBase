package com.fengzhi.mybase.model.test.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fengzhi.mybase.R;
import com.fengzhi.mybase.api.ApiEngine;
import com.fengzhi.mybase.base.BaseActivity;
import com.fengzhi.mybase.bean.SupplierDataBean;
import com.fengzhi.mybase.model.test.contract.TestContract;
import com.fengzhi.mybase.model.test.presenter.TestPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements TestContract.View {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.but)
    Button button;
    private TestPresenter presenter = new TestPresenter(this);

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void showLodding(String message) {
        showLoadingDialog(message);
    }

    @Override
    public void showError(String error) {
        onHideLodding();
        SToast(error);
        Log.i("ddd", "showError: "+error);
    }

    @Override
    public void onHideLodding() {
        dismissLoadingDialog();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.textView, R.id.but})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textView:
                ApiEngine.getInstance().getApiService().doTest1().enqueue(new Callback<SupplierDataBean>() {


                    @Override
                    public void onResponse(Call<SupplierDataBean> call, Response<SupplierDataBean> response) {
                        Log.i("ddd", "onResponse: ");
                    }

                    @Override
                    public void onFailure(Call<SupplierDataBean> call, Throwable t) {
                        Log.i("ddd", "onFailure: ");
                    }
                });
                break;
            case R.id.but:
                presenter.doTest();
                break;
        }
    }

    @Override
    public void getDataSuccess(List<SupplierDataBean.DataBean> dataBeans) {
        Log.i("ddd", "getDataSuccess: "+dataBeans.get(0).getForm());
    }

}

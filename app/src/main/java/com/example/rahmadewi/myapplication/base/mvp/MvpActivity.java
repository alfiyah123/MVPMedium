package com.example.rahmadewi.myapplication.base.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.rahmadewi.myapplication.base.ui.BaseActivity;
import com.example.rahmadewi.myapplication.base.ui.BasePresenter;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity {
    protected P presenter;
    protected abstract P cretePresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        presenter = cretePresenter();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(presenter != null){
            presenter.dettachView();
        }
    }
}

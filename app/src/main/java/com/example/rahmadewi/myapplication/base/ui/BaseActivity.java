package com.example.rahmadewi.myapplication.base.ui;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import retrofit2.Call;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

public class BaseActivity extends AppCompatActivity{

    public Activity activity;
    CompositeSubscription compositeSubscription;
    List<Call> calls;

    @Override
    public void setContentView(@LayoutRes int layoutResID){
        super.setContentView(layoutResID);
        activity = this;
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        onCandelled();
        onUnsubscribe();
    }

    private void onCandelled(){
        if(calls !=null && calls.size() > 0){
            for (Call call : calls){
                if (!call.isCanceled()){
                    call.cancel();
                }
            }
        }
    }

    public void addCalls(Call call){
        if(calls == null){
            calls = new ArrayList<>();
        }
        calls.add(call);
    }

    public void onUnsubscribe(){
        if(compositeSubscription != null && compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe();
        }
    }
}

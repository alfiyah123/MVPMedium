package com.example.rahmadewi.myapplication.base.ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import butterknife.ButterKnife;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

public class BaseFragment extends Fragment{
    public Activity activity;
    private CompositeSubscription compositeSubscription;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        activity = getActivity();
        ButterKnife.bind(activity,view);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        onUnsubscribe();
    }

    public void onUnsubscribe(){
        if(compositeSubscription != null){
            compositeSubscription.unsubscribe();
        }
    }
}

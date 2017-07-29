package com.example.rahmadewi.myapplication.feature.home;

import android.app.Activity;
import android.content.Intent;

import com.example.rahmadewi.myapplication.base.ui.BasePresenter;
import com.example.rahmadewi.myapplication.feature.detail.DetailActivity;
import com.example.rahmadewi.myapplication.models.Books;
import com.example.rahmadewi.myapplication.models.ItemsItem;
import com.example.rahmadewi.myapplication.network.NetworkCallback;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

public class MainPresenter extends BasePresenter<MainView>{

    MainPresenter(MainView view){
        super.attachView(view);
    }

    void loadData(String key){
        view.showLoading();
        addSubscribe(apiStrores.getTopBooks(key), new NetworkCallback<Books>() {
            @Override
            public void onSuccess(Books model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }

    void getItem(ItemsItem item, Activity activity){
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra("id", item.getId());
        view.moveToDetail(intent);
    }
}

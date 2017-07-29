package com.example.rahmadewi.myapplication.feature.detail;

import com.example.rahmadewi.myapplication.base.ui.BasePresenter;
import com.example.rahmadewi.myapplication.models.ItemsItem;
import com.example.rahmadewi.myapplication.network.NetworkCallback;


/**
 * Created by Rahmadewi on 7/29/2017.
 */

public class DetailPresenter extends BasePresenter<DetailView>{

    DetailPresenter(DetailView view) {
        super.attachView(view);
    }

    void loadData(String id) {
        view.showLoading();
        addSubscribe(apiStrores.getDetailBook(id), new NetworkCallback<ItemsItem>() {
            @Override
            public void onSuccess(ItemsItem model) {
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
}

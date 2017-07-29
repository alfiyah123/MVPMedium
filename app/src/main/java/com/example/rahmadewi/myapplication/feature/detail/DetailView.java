package com.example.rahmadewi.myapplication.feature.detail;

import com.example.rahmadewi.myapplication.models.ItemsItem;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

interface DetailView {

    void showLoading();

    void hideLoading();

    void getDataSuccess(ItemsItem item);

    void getDataFail(String message);

    void refreshData();

}

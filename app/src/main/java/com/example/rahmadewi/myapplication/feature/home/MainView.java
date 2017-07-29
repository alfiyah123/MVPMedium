package com.example.rahmadewi.myapplication.feature.home;

import android.content.Intent;

import com.example.rahmadewi.myapplication.models.Books;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

interface MainView {
    void showLoading();
    void hideLoading();
    void getDataSuccess(Books model);
    void getDataFail(String message);
    void moveToDetail(Intent intent);
}

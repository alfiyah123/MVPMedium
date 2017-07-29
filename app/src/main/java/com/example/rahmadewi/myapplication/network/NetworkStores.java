package com.example.rahmadewi.myapplication.network;

import com.example.rahmadewi.myapplication.models.Books;
import com.example.rahmadewi.myapplication.models.ItemsItem;

import rx.Observable;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Rahmadewi on 7/29/2017.
 */

public interface NetworkStores {
    @GET("volumes")
    Observable<Books> getTopBooks(@Query("q") String key);

    @GET("volumes/{id}")
    Observable<ItemsItem> getDetailBook(@Path("id") String id);
}

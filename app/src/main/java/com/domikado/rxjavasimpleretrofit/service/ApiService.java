package com.domikado.rxjavasimpleretrofit.service;
// Created by irwancannady (irwancannady@gmail.com) on 2/3/17 at 3:17 PM.



import com.domikado.rxjavasimpleretrofit.model.AndroidModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    @GET("android/jsonarray/")
    Observable<List<AndroidModel>> getData();
}

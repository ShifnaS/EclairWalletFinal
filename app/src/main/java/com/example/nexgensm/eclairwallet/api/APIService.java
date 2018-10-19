package com.example.nexgensm.eclairwallet.api;

import com.example.nexgensm.eclairwallet.model.Results;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by lenovo on 3/31/2018.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("Login")
    Call<Results> userlogincall(@Field("user") String username, @Field("pass") String userpass);





}

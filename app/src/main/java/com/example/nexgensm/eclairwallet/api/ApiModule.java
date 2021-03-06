package com.example.nexgensm.eclairwallet.api;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 3/31/2018.
 */
@Module
public class ApiModule {

    private static Retrofit getRetrofitInstance()
    {
        Gson gson =     new GsonBuilder().setLenient().create();

        return new Retrofit.Builder()
                .baseUrl(APIUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static APIService getAPIService()
    {
        return getRetrofitInstance().create(APIService.class);
    }


}

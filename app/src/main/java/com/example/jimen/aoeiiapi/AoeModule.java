package com.example.jimen.aoeiiapi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AoeModule {

    static AoeAPI aoeAPI;

    public static AoeAPI getAoeAPI(){
        if (aoeAPI == null){
            Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://age-of-empires-2-api.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            aoeAPI = retrofit.create(AoeAPI.class);
        }
        return aoeAPI;
    }
}

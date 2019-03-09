package com.example.jimen.aoeiiapi;

import com.example.jimen.aoeiiapi.Model.CivList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AoeAPI {

    @GET("api/v1/civilizations")
    Call<CivList> getCivs();

}

package com.example.jimen.aoeiiapi;

import com.example.jimen.aoeiiapi.Model.CivList;
import com.example.jimen.aoeiiapi.Model.StructureList;
import com.example.jimen.aoeiiapi.Model.TechList;
import com.example.jimen.aoeiiapi.Model.UnitList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AoeAPI {

    @GET("/api/v1/civilizations")
    Call<CivList> getCivs();

    @GET("/api/v1/units")
    Call<UnitList> getUnits();

    @GET("/api/v1/structures")
    Call<StructureList> getStructures();

    @GET("/api/v1/technologies")
    Call<TechList> getTechs();

}

package com.example.jimen.aoeiiapi;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.example.jimen.aoeiiapi.Model.CivList;
import com.example.jimen.aoeiiapi.Model.Civilization;
import com.example.jimen.aoeiiapi.Model.Structure;
import com.example.jimen.aoeiiapi.Model.StructureList;
import com.example.jimen.aoeiiapi.Model.Tech;
import com.example.jimen.aoeiiapi.Model.TechList;
import com.example.jimen.aoeiiapi.Model.Unit;
import com.example.jimen.aoeiiapi.Model.UnitList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AoeRepository {
    AoeAPI aoeAPI;

    public AoeRepository(){
        aoeAPI = AoeModule.getAoeAPI();
    }

    public LiveData<List<Civilization>> getCivs(){
        final MutableLiveData<List<Civilization>> civList = new MutableLiveData<>();

        aoeAPI.getCivs().enqueue(new Callback<CivList>() {
            @Override
            public void onResponse(Call<CivList> call, Response<CivList> response) {
                civList.setValue(response.body().civilizations);
                System.out.println("**********************************");
                System.out.println(response.body().civilizations);
            }
            @Override
            public void onFailure(Call<CivList> call, Throwable t) {}
        });
        return civList;
    }

    public LiveData<List<Unit>> getUnits(){
        final MutableLiveData<List<Unit>> unitList = new MutableLiveData<>();

        aoeAPI.getUnits().enqueue(new Callback<UnitList>() {
            @Override
            public void onResponse(Call<UnitList> call, Response<UnitList> response) {
                System.out.println("**********************************");
                System.out.println(response.body().units);
                unitList.setValue(response.body().units);
            }
            @Override
            public void onFailure(Call<UnitList> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return unitList;
    }

    public LiveData<List<Structure>> getStructures(){
        final MutableLiveData<List<Structure>> structureList = new MutableLiveData<>();

        aoeAPI.getStructures().enqueue(new Callback<StructureList>() {
            @Override
            public void onResponse(Call<StructureList> call, Response<StructureList> response) {
                System.out.println("**********************************");
                System.out.println(response.body());
                structureList.setValue(response.body().structures);
            }
            @Override
            public void onFailure(Call<StructureList> call, Throwable t) {}
        });
        return structureList;
    }

    public LiveData<List<Tech>> getTechs(){
        final MutableLiveData<List<Tech>> techList = new MutableLiveData<>();

        aoeAPI.getTechs().enqueue(new Callback<TechList>() {
            @Override
            public void onResponse(Call<TechList> call, Response<TechList> response) {
                System.out.println("**********************************");
                System.out.println(response.body().technologies);
                techList.setValue(response.body().technologies);
            }
            @Override
            public void onFailure(Call<TechList> call, Throwable t) {}
        });
        return techList;
    }

}



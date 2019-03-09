package com.example.jimen.aoeiiapi;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.example.jimen.aoeiiapi.Model.CivList;
import com.example.jimen.aoeiiapi.Model.Civilization;

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
        final MutableLiveData civList = new MutableLiveData<>();

        aoeAPI.getCivs().enqueue(new Callback<CivList>() {
            @Override
            public void onResponse(Call<CivList> call, Response<CivList> response) {
                civList.setValue(response.body().results);
            }

            @Override
            public void onFailure(Call<CivList> call, Throwable t) {
            }
        });

        return civList;
    }

}


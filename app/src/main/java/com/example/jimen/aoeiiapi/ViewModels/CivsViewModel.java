package com.example.jimen.aoeiiapi.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.jimen.aoeiiapi.AoeRepository;
import com.example.jimen.aoeiiapi.Model.Civilization;

import java.util.List;

public class CivsViewModel extends AndroidViewModel {
    private AoeRepository aoeRepository;

    public CivsViewModel(@NonNull Application application) {
        super(application);
        aoeRepository = new AoeRepository();
    }

    public LiveData<List<Civilization>> getCivs(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++"+aoeRepository.getCivs());
        return aoeRepository.getCivs();
    }
}

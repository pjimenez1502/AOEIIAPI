package com.example.jimen.aoeiiapi.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.jimen.aoeiiapi.AoeRepository;
import com.example.jimen.aoeiiapi.Model.Unit;

import java.util.List;

public class UnitsViewModel extends AndroidViewModel {
    private AoeRepository aoeRepository;

    public UnitsViewModel(@NonNull Application application) {
        super(application);
        aoeRepository = new AoeRepository();
    }

    public LiveData<List<Unit>> getUnits() {
        return aoeRepository.getUnits();
    }
}

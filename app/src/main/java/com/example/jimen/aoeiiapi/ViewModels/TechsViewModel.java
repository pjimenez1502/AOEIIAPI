package com.example.jimen.aoeiiapi.ViewModels;

import android.app.Application;
import android.app.ListActivity;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.jimen.aoeiiapi.AoeRepository;
import com.example.jimen.aoeiiapi.Model.Tech;

import java.util.List;

public class TechsViewModel extends AndroidViewModel {
    public AoeRepository aoeRepository;

    public TechsViewModel(@NonNull Application application) {
        super(application);
        aoeRepository = new AoeRepository();
    }

    public LiveData<List<Tech>> getTechs() {return aoeRepository.getTechs();}
}


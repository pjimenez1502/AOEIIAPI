package com.example.jimen.aoeiiapi.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.jimen.aoeiiapi.AoeRepository;
import com.example.jimen.aoeiiapi.Model.Structure;

import java.util.List;

public class StructuresViewModel extends AndroidViewModel {
    private AoeRepository aoeRepository;

    public StructuresViewModel(@NonNull Application application) {
        super(application);
        aoeRepository = new AoeRepository();
    }

    public LiveData<List<Structure>> getStructures() {return aoeRepository.getStructures();}
}

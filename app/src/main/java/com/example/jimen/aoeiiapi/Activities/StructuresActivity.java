package com.example.jimen.aoeiiapi.Activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jimen.aoeiiapi.Adapters.StructuresAdapter;
import com.example.jimen.aoeiiapi.Model.Structure;
import com.example.jimen.aoeiiapi.R;
import com.example.jimen.aoeiiapi.ViewModels.StructuresViewModel;

import java.util.List;

public class StructuresActivity extends AppCompatActivity {

    RecyclerView strsRV;
    StructuresAdapter strsAdapter;
    StructuresViewModel strsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structures);

        strsRV = findViewById(R.id.structures_recycler);

        strsRV.setLayoutManager(new LinearLayoutManager(this));

        strsAdapter = new StructuresAdapter();
        strsRV.setAdapter(strsAdapter);

        strsViewModel = ViewModelProviders.of(this).get(StructuresViewModel.class);
        strsViewModel.getStructures().observe(this, new Observer<List<Structure>>() {
            @Override
            public void onChanged(@Nullable List<Structure> structures) {
                strsAdapter.strList = structures;
                strsAdapter.notifyDataSetChanged();
            }
        });
    }
}

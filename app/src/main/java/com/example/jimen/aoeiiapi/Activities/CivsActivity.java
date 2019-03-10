package com.example.jimen.aoeiiapi.Activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jimen.aoeiiapi.Adapters.CivsAdapter;
import com.example.jimen.aoeiiapi.ViewModels.CivsViewModel;
import com.example.jimen.aoeiiapi.Model.Civilization;
import com.example.jimen.aoeiiapi.R;

import java.util.List;

public class CivsActivity extends AppCompatActivity {

    RecyclerView civsRV;
    CivsAdapter civsAdapter;
    CivsViewModel civsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civs);

        civsRV = findViewById(R.id.civ_recycler);

        civsRV.setLayoutManager(new LinearLayoutManager(this));

        civsAdapter = new CivsAdapter();
        civsRV.setAdapter(civsAdapter);

        civsViewModel = ViewModelProviders.of(this).get(CivsViewModel.class);
        civsViewModel.getCivs().observe(this, new Observer<List<Civilization>>() {
            @Override
            public void onChanged(@Nullable List<Civilization> civilizations) {
                civsAdapter.civList = civilizations;
                civsAdapter.notifyDataSetChanged();
            }
        });

    }
}

package com.example.jimen.aoeiiapi.Activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jimen.aoeiiapi.Adapters.UnitsAdapter;
import com.example.jimen.aoeiiapi.Model.Unit;
import com.example.jimen.aoeiiapi.R;
import com.example.jimen.aoeiiapi.ViewModels.UnitsViewModel;

import java.util.List;

public class UnitsActivity extends AppCompatActivity {

    RecyclerView unitsRV;
    UnitsAdapter unitsAdapter;
    UnitsViewModel unitsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);

        unitsRV = findViewById(R.id.units_recycler);

        unitsRV.setLayoutManager(new LinearLayoutManager(this));

        unitsAdapter = new UnitsAdapter();
        unitsRV.setAdapter(unitsAdapter);

        unitsViewModel = ViewModelProviders.of(this).get(UnitsViewModel.class);
        unitsViewModel.getUnits().observe(this, new Observer<List<Unit>>() {
            @Override
            public void onChanged(@Nullable List<Unit> units) {
                unitsAdapter.unitList = units;
                unitsAdapter.notifyDataSetChanged();
            }
        });
    }
}

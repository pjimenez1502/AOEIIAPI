package com.example.jimen.aoeiiapi.Activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jimen.aoeiiapi.Adapters.TechAdapter;
import com.example.jimen.aoeiiapi.Model.Tech;
import com.example.jimen.aoeiiapi.R;
import com.example.jimen.aoeiiapi.ViewModels.TechsViewModel;

import java.util.List;

public class TechsActivity extends AppCompatActivity {

    RecyclerView techRV;
    TechAdapter techAdapter;
    TechsViewModel techsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techs);

        techRV = findViewById(R.id.techs_recycler);

        techRV.setLayoutManager(new LinearLayoutManager(this));

        techAdapter = new TechAdapter();
        techRV.setAdapter(techAdapter);

        techsViewModel = ViewModelProviders.of(this).get(TechsViewModel.class);
        techsViewModel.getTechs().observe(this, new Observer<List<Tech>>() {
            @Override
            public void onChanged(@Nullable List<Tech> technologies) {
                techAdapter.techList = technologies;
                techAdapter.notifyDataSetChanged();
            }
        });

    }
}

package com.example.jimen.aoeiiapi.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.example.jimen.aoeiiapi.GlideApp;
import com.example.jimen.aoeiiapi.R;

public class MainActivity extends AppCompatActivity {

    ImageView imgvw1;
    ImageView imgvw2;
    ImageView imgvw3;
    ImageView imgvw4;

    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvw1 = findViewById(R.id.imgVW1);
        imgvw2 = findViewById(R.id.imgVW2);
        imgvw3 = findViewById(R.id.imgVW3);
        imgvw4 = findViewById(R.id.imgVW4);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);

        GlideApp.with(getBaseContext()).load("https://i.imgur.com/zwhbvkJ.jpg").into(imgvw1);
        GlideApp.with(getBaseContext()).load("https://i.imgur.com/tfAf6yV.jpg").into(imgvw2);
        GlideApp.with(getBaseContext()).load("https://i.imgur.com/oVnaiY8.jpg").into(imgvw3);
        GlideApp.with(getBaseContext()).load("https://i.imgur.com/DY0txyF.jpg").into(imgvw4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CivsActivity.class));
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UnitsActivity.class));
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StructuresActivity.class));
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TechsActivity.class));
            }
        });
    }
}


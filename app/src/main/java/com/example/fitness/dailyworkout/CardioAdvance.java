package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.CardioAdvanceAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class CardioAdvance extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardioAdvanceAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_advance);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        init();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void init() {
        this.recyclerView = findViewById(R.id.recycleview);
        this.layoutManager = new LinearLayoutManager(getBaseContext());
        this.adapter = new CardioAdvanceAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.CardioAdvance> getlistabs() {
        ArrayList<com.example.fitness.dto.CardioAdvance> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.CardioAdvance(R.drawable.mountainclimber,"mountain climber"));
        absArrayList.add(new com.example.fitness.dto.CardioAdvance(R.drawable.planksk,"plank ski hops"));
        absArrayList.add(new com.example.fitness.dto.CardioAdvance(R.drawable.diagonal,"diagonal jumps"));
        absArrayList.add(new com.example.fitness.dto.CardioAdvance(R.drawable.rotational,"rotational jacks"));
        absArrayList.add(new com.example.fitness.dto.CardioAdvance(R.drawable.burpess,"burpees"));
        absArrayList.add(new com.example.fitness.dto.CardioAdvance(R.drawable.inchworm,"inchworm crawl"));
        return absArrayList;
    }
}
package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.ButtAdvanceAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class ButtAdvance extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ButtAdvanceAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butt_advance);
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
        this.adapter = new ButtAdvanceAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.ButtAdvance> getlistabs() {
        ArrayList<com.example.fitness.dto.ButtAdvance> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.bottomuplungtocrossover,"bottoms-up lunge to crossover lunge"));
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.supportedsinglelegsquat,"supported single-leg squat"));
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.singleleghiplift,"single-leg deadlift"));
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.powerskip,"powerskip"));
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.rearfootelevatedsplitsquat,"Rear-foot-elevated split squat"));
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.rearfootelevateddeadlift,"Rear-foot elevated deadlift"));
        absArrayList.add(new com.example.fitness.dto.ButtAdvance(R.drawable.singlelegsquatreachacross,"single-leg squat reach across"));
        return absArrayList;
    }
}
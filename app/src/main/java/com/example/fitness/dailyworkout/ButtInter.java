package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.ButtInterAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class ButtInter extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ButtInterAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butt_inter);
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
        this.adapter = new ButtInterAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.ButtInter> getlistabs() {
        ArrayList<com.example.fitness.dto.ButtInter> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.jumpingjack,"diagnonal sqaut"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.mountainclimber,"hip thrust single-arm reach"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.legraises,"step-up"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.russiantwist,"side lunge shift"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.abdominal,"walking lunge"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.plank,"single leg hip lift"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.heeltouch,"hip drive step-up"));
        absArrayList.add(new com.example.fitness.dto.ButtInter(R.drawable.cobra,"side step-up"));
        return absArrayList;
    }
}
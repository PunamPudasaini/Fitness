package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdvanceAdapter;
import com.example.fitness.adapter.ArmAdapter;
import com.example.fitness.adapter.ArmAdvanceAdapter;
import com.example.fitness.dto.AbsAdvance;

import java.util.ArrayList;

public class ArmAdvance extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArmAdvanceAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_advance);
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
        this.adapter = new ArmAdvanceAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.ArmAdvance> getlistabs() {
        ArrayList<com.example.fitness.dto.ArmAdvance> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.ArmAdvance(R.drawable.armcurl,"arm curls crunch"));
        absArrayList.add(new com.example.fitness.dto.ArmAdvance(R.drawable.militarypushup,"military pushup"));
        absArrayList.add(new com.example.fitness.dto.ArmAdvance(R.drawable.chestpressgif,"chest press pulse"));
        absArrayList.add(new com.example.fitness.dto.ArmAdvance(R.drawable.tricepstretch,"tricep stretch"));
        absArrayList.add(new com.example.fitness.dto.ArmAdvance(R.drawable.skippingwithoutrope,"skipping without rope"));
        absArrayList.add(new com.example.fitness.dto.ArmAdvance(R.drawable.standingbicep,"standing bicep stretch"));
        return absArrayList;
    }
}
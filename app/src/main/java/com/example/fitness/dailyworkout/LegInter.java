package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.LegInterAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class LegInter extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LegInterAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_inter);
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
        this.adapter = new LegInterAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.LegInter> getlistabs() {
        ArrayList<com.example.fitness.dto.LegInter> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.LegInter(R.drawable.lungejumpp,"lunges"));
        absArrayList.add(new com.example.fitness.dto.LegInter(R.drawable.sidelegcircle,"side leg circle"));
        absArrayList.add(new com.example.fitness.dto.LegInter(R.drawable.flutterkick,"reverse flutter kick"));
        absArrayList.add(new com.example.fitness.dto.LegInter(R.drawable.standingquadstretch,"quad stretch with wall"));
        absArrayList.add(new com.example.fitness.dto.LegInter(R.drawable.calfraises,"calf raisesd with splayed foot"));
        return absArrayList;
    }
}
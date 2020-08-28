package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.LegAdvanceAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class LegAdvance extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LegAdvanceAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_advance);
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
        this.adapter = new LegAdvanceAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.LegAdvance> getlistabs() {
        ArrayList<com.example.fitness.dto.LegAdvance> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.squat,"jumping squats"));
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.sidelyningleglift,"bottom leg lift"));
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.lungejump,"lunges jump"));
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.sidelegcircle,"side leg circle"));
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.glutekickback,"glute kick back"));
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.wallsit,"wall sit"));
        absArrayList.add(new com.example.fitness.dto.LegAdvance(R.drawable.lyingbutterfly,"lying butterfly stretch"));
        return absArrayList;
    }
}
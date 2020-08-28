package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.CardioInterAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class CardioInter extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardioInterAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_inter);
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
        this.adapter = new CardioInterAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.CardioInter> getlistabs() {
        ArrayList<com.example.fitness.dto.CardioInter> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.CardioInter(R.drawable.squatjump,"squat jumps"));
        absArrayList.add(new com.example.fitness.dto.CardioInter(R.drawable.standingalter,"standing alternatively toe touches"));
        absArrayList.add(new com.example.fitness.dto.CardioInter(R.drawable.lungejump,"lunge jumps"));
        absArrayList.add(new com.example.fitness.dto.CardioInter(R.drawable.boxjump,"box jumps"));
        absArrayList.add(new com.example.fitness.dto.CardioInter(R.drawable.plankjack,"plank jack"));
        return absArrayList;
    }
}
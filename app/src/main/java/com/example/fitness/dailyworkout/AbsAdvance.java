package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.AbsAdvanceAdapter;
import com.example.fitness.adapter.AbsInterAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class AbsAdvance extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AbsAdvanceAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_advanca);
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
        this.adapter = new AbsAdvanceAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.AbsAdvance> getlistabs() {
        ArrayList<com.example.fitness.dto.AbsAdvance> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.pallofpress,"pall of press"));
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.hollow,"hollow body rock"));
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.hanginglegraise,"hanging leg raise with spit"));
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.lsit,"L-sit"));
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.bicyclecrunch,"Bicycle crunches"));
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.reversecrunch,"reverse crunch"));
        absArrayList.add(new com.example.fitness.dto.AbsAdvance(R.drawable.deadbug,"dead bug"));
        return absArrayList;
    }
}
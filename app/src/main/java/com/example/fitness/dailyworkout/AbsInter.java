package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.AbsInterAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class AbsInter extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AbsInterAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_inter);
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
        this.adapter = new AbsInterAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.AbsInter> getlistabs() {
        ArrayList<com.example.fitness.dto.AbsInter> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.legraises,"leg raises"));
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.barbellrollout,"abs roll-out"));
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.birddog,"Bird-dog"));
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.hangingkneeraise,"hanging knee raise"));
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.dumbel,"dumbbell woodchop"));
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.medicineballcrunch,"medicine ball crunch"));
        absArrayList.add(new com.example.fitness.dto.AbsInter(R.drawable.plank,"walking plank"));
        return absArrayList;
    }


}
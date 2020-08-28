package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.ArmInterAdapter;
import com.example.fitness.dto.Abs;

import java.util.ArrayList;

public class ArmInter extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArmInterAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_inter);
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
        this.adapter = new ArmInterAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<com.example.fitness.dto.ArmInter> getlistabs() {
        ArrayList<com.example.fitness.dto.ArmInter> absArrayList = new ArrayList<>();
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.jumpingjack,"Jumping jacks"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.mountainclimber,"mountain climber"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.legraises,"leg raises"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.russiantwist,"russian twist"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.abdominal,"abdominal crunches"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.plank,"plank"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.heeltouch,"heel touch"));
        absArrayList.add(new com.example.fitness.dto.ArmInter(R.drawable.cobra,"cobra stretch"));
        return absArrayList;
    }
}
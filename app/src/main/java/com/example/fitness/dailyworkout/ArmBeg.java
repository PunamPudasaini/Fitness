package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.AbsAdapter;
import com.example.fitness.adapter.ArmAdapter;
import com.example.fitness.dto.Abs;
import com.example.fitness.dto.Arm;

import java.util.ArrayList;

public class ArmBeg extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArmAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_beg);
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
        this.adapter = new ArmAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<Arm> getlistabs() {
        ArrayList<Arm> arms = new ArrayList<>();
        arms.add(new Arm(R.drawable.jumpingjack,"Arm Raises"));
        arms.add(new Arm(R.drawable.mountainclimber,"arm circle clockwise"));
        arms.add(new Arm(R.drawable.legraises,"arm circle counter clockwise"));
        arms.add(new Arm(R.drawable.russiantwist,"side arm raise"));
        arms.add(new Arm(R.drawable.abdominal,"leg barbell curl left"));
        arms.add(new Arm(R.drawable.plank,"leg barbell curl right"));
        arms.add(new Arm(R.drawable.heeltouch,"wall push-ups"));
        arms.add(new Arm(R.drawable.cobra,"punches"));
        return arms;
    }
}
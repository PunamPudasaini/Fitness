package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.CardioAdapter;
import com.example.fitness.adapter.LegAdapter;
import com.example.fitness.dto.Cardio;
import com.example.fitness.dto.Leg;

import java.util.ArrayList;

public class LegBeg extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LegAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_beg);

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
        this.adapter = new LegAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<Leg> getlistabs() {
        ArrayList<Leg> butts = new ArrayList<>();
        butts.add(new Leg(R.drawable.sidehop,"Side hop"));
        butts.add(new Leg(R.drawable.squat,"squats"));
        butts.add(new Leg(R.drawable.donkeykick,"donkey kick"));
        butts.add(new Leg(R.drawable.standingquadstretch,"Quad stretch with wall"));
        butts.add(new Leg(R.drawable.calfraises,"wall calf raises"));
        butts.add(new Leg(R.drawable.calfstretch,"calf stretch"));
        butts.add(new Leg(R.drawable.sumosquatcalf,"sumo squat calf raise with wall"));
        return butts;
    }
}
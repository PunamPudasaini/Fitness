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
        butts.add(new Leg(R.drawable.jumpingjack,"Arm Raises"));
        butts.add(new Leg(R.drawable.mountainclimber,"arm circle clockwise"));
        butts.add(new Leg(R.drawable.legraises,"arm circle counter clockwise"));
        butts.add(new Leg(R.drawable.russiantwist,"side arm raise"));
        butts.add(new Leg(R.drawable.abdominal,"leg barbell curl left"));
        butts.add(new Leg(R.drawable.plank,"leg barbell curl right"));
        butts.add(new Leg(R.drawable.heeltouch,"wall push-ups"));
        butts.add(new Leg(R.drawable.cobra,"punches"));
        return butts;
    }
}
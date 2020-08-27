package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.ButtAdapter;
import com.example.fitness.adapter.CardioAdapter;
import com.example.fitness.dto.Butt;
import com.example.fitness.dto.Cardio;

import java.util.ArrayList;

public class CardioBeg extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardioAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_beg);
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
        this.adapter = new CardioAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<Cardio> getlistabs() {
        ArrayList<Cardio> butts = new ArrayList<>();
        butts.add(new Cardio(R.drawable.jumpingjack,"Arm Raises"));
        butts.add(new Cardio(R.drawable.mountainclimber,"arm circle clockwise"));
        butts.add(new Cardio(R.drawable.legraises,"arm circle counter clockwise"));
        butts.add(new Cardio(R.drawable.russiantwist,"side arm raise"));
        butts.add(new Cardio(R.drawable.abdominal,"leg barbell curl left"));
        butts.add(new Cardio(R.drawable.plank,"leg barbell curl right"));
        butts.add(new Cardio(R.drawable.heeltouch,"wall push-ups"));
        butts.add(new Cardio(R.drawable.cobra,"punches"));
        return butts;
    }
}
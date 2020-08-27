package com.example.fitness.dailyworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fitness.R;
import com.example.fitness.adapter.ArmAdapter;
import com.example.fitness.adapter.ButtAdapter;
import com.example.fitness.dto.Arm;
import com.example.fitness.dto.Butt;

import java.util.ArrayList;

public class ButtBeg extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ButtAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butt_beg);
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
        this.adapter = new ButtAdapter(getBaseContext(),getlistabs());
    }

    private ArrayList<Butt> getlistabs() {
        ArrayList<Butt> butts = new ArrayList<>();
        butts.add(new Butt(R.drawable.jumpingjack,"Arm Raises"));
        butts.add(new Butt(R.drawable.mountainclimber,"arm circle clockwise"));
        butts.add(new Butt(R.drawable.legraises,"arm circle counter clockwise"));
        butts.add(new Butt(R.drawable.russiantwist,"side arm raise"));
        butts.add(new Butt(R.drawable.abdominal,"leg barbell curl left"));
        butts.add(new Butt(R.drawable.plank,"leg barbell curl right"));
        butts.add(new Butt(R.drawable.heeltouch,"wall push-ups"));
        butts.add(new Butt(R.drawable.cobra,"punches"));
        return butts;
    }
}
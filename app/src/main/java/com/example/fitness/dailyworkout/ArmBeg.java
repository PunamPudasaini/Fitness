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
        arms.add(new Arm(R.drawable.armraises,"Arm Raises"));
        arms.add(new Arm(R.drawable.armcircle,"arm circle clockwise"));
        arms.add(new Arm(R.drawable.barbellcurl,"barbell curl"));
        arms.add(new Arm(R.drawable.pushup,"push-ups"));
        arms.add(new Arm(R.drawable.tricepdip,"Triceps dips"));
        arms.add(new Arm(R.drawable.tricepstretch,"Triceps stretch"));
        arms.add(new Arm(R.drawable.standingbicep,"Standing biceps stretch"));


        return arms;
    }
}
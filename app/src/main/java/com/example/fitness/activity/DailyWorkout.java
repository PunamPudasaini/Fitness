package com.example.fitness.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

import com.example.fitness.R;
import com.example.fitness.adapter.DailyWorkoutAdapter;
import com.example.fitness.dto.Workout;

import java.util.ArrayList;

public class DailyWorkout extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DailyWorkoutAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_workout);
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
        this.adapter = new DailyWorkoutAdapter(getBaseContext(),getlistworkout());

    }

    private ArrayList<Workout> getlistworkout(){
        ArrayList<Workout> workoutArrayList = new ArrayList<>();
        workoutArrayList.add(new Workout(R.mipmap.abs,"ABS Beginner"));
        workoutArrayList.add(new Workout(R.mipmap.armsbeg,"ARM Beginner"));
        workoutArrayList.add(new Workout(R.mipmap.butt,"BUTT Beginner"));
        workoutArrayList.add(new Workout(R.mipmap.cardio,"CARDIO Beginner"));
        workoutArrayList.add(new Workout(R.mipmap.leg,"LEG Beginner"));

        workoutArrayList.add(new Workout(R.mipmap.absinterr,"ABS intermediate"));
        workoutArrayList.add(new Workout(R.mipmap.armsinter,"ARM intermediate"));
        workoutArrayList.add(new Workout(R.mipmap.butint,"BUTT intermediate"));
        workoutArrayList.add(new Workout(R.mipmap.cardioin,"CARDIO intermediate"));
        workoutArrayList.add(new Workout(R.mipmap.legintt,"LEG intermediate"));

        workoutArrayList.add(new Workout(R.mipmap.absadvance,"ABS Advance"));
        workoutArrayList.add(new Workout(R.mipmap.armsadvance,"ARM Advance"));
        workoutArrayList.add(new Workout(R.mipmap.butadd,"BUTT Advance"));
        workoutArrayList.add(new Workout(R.mipmap.cardioadvance,"CARDIO Advance"));
        workoutArrayList.add(new Workout(R.mipmap.legadvance,"LEG Advance"));
        return workoutArrayList;
    }

}
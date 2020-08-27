package com.example.fitness.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness.R;
import com.example.fitness.activity.DailyWorkout;
import com.example.fitness.dailyworkout.AbsBeg;
import com.example.fitness.dailyworkout.ArmBeg;
import com.example.fitness.dailyworkout.ButtBeg;
import com.example.fitness.dailyworkout.CardioBeg;
import com.example.fitness.dailyworkout.LegBeg;
import com.example.fitness.dto.Workout;

import java.util.ArrayList;

public class DailyWorkoutAdapter extends RecyclerView.Adapter<DailyWorkoutAdapter.DailyWorkoutViewHolder> {
    private Context context;
    private ArrayList<Workout> workouts;

    public DailyWorkoutAdapter(Context context, ArrayList<Workout> workouts) {
        this.context = context;
        this.workouts = workouts;
    }

    @NonNull
    @Override
    public DailyWorkoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.workout_design,parent,false);
        return new DailyWorkoutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DailyWorkoutViewHolder holder, final int position) {
        holder.textView.setText(workouts.get(position).getName());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(workouts.get(position).getImage()));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), "position" + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                if (position == 0){
                    context.startActivity(new Intent(context, AbsBeg.class));
                }else if (position == 1){
                    context.startActivity(new Intent(context, ArmBeg.class));
                }
                else if (position == 2){
                    context.startActivity(new Intent(context, ButtBeg.class));
                }
                else if (position == 3){
                    context.startActivity(new Intent(context, CardioBeg.class));
                }
                else if (position == 4){
                    context.startActivity(new Intent(context, LegBeg.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return workouts.size();
    }

    class DailyWorkoutViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public DailyWorkoutViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
        }
    }
}

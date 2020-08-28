package com.example.fitness.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitness.R;
import com.example.fitness.dto.AbsAdvance;
import com.example.fitness.exercise.abs.Abdominal;
import com.example.fitness.exercise.abs.BicycleCrunch;
import com.example.fitness.exercise.abs.CobraStretch;
import com.example.fitness.exercise.abs.DeadBug;
import com.example.fitness.exercise.abs.HangingLeg;
import com.example.fitness.exercise.abs.HeelTouch;
import com.example.fitness.exercise.abs.Hollow;
import com.example.fitness.exercise.abs.JumpingJack;
import com.example.fitness.exercise.abs.LegRaises;
import com.example.fitness.exercise.abs.Lsit;
import com.example.fitness.exercise.abs.MountainClimber;
import com.example.fitness.exercise.abs.PallOff;
import com.example.fitness.exercise.abs.Plank;
import com.example.fitness.exercise.abs.ReverseCrunch;
import com.example.fitness.exercise.abs.RussianTwist;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class AbsAdvanceAdapter extends RecyclerView.Adapter<AbsAdvanceAdapter.AbsAdvanceViewHolder> {
    Context context;
    ArrayList<AbsAdvance> absAdvances;

    public AbsAdvanceAdapter(Context context, ArrayList<AbsAdvance> absAdvances) {
        this.context = context;
        this.absAdvances = absAdvances;
    }

    @NonNull
    @Override
    public AbsAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new AbsAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AbsAdvanceViewHolder holder, final int position) {
        holder.textView.setText(absAdvances.get(position).getName());
        Glide.with(context).load(absAdvances.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, PallOff.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, Hollow.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, HangingLeg.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, Lsit.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, BicycleCrunch.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, ReverseCrunch.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, DeadBug.class));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return absAdvances.size();
    }

    class AbsAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public AbsAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

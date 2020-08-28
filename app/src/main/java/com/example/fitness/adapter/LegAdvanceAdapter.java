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
import com.example.fitness.dto.LegAdvance;
import com.example.fitness.exercise.cardio.BoxJump;
import com.example.fitness.exercise.cardio.PlankJack;
import com.example.fitness.exercise.cardio.SquatJump;
import com.example.fitness.exercise.cardio.StandingAlter;
import com.example.fitness.exercise.leg.BottomLegLift;
import com.example.fitness.exercise.leg.GluteKickBack;
import com.example.fitness.exercise.leg.JumpingSquat;
import com.example.fitness.exercise.leg.LungeJump;
import com.example.fitness.exercise.leg.LyingButterflyStretch;
import com.example.fitness.exercise.leg.SideLegCircle;
import com.example.fitness.exercise.leg.WallSit;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class LegAdvanceAdapter extends RecyclerView.Adapter<LegAdvanceAdapter.LegAdvanceViewHolder> {
    Context context;
    ArrayList<LegAdvance> legAdvances;

    public LegAdvanceAdapter(Context context, ArrayList<LegAdvance> legAdvances) {
        this.context = context;
        this.legAdvances = legAdvances;
    }

    @NonNull
    @Override
    public LegAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new LegAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LegAdvanceViewHolder holder, final int position) {
        holder.textView.setText(legAdvances.get(position).getName());
        Glide.with(context).load(legAdvances.get(position).getImage()).into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, JumpingSquat.class));
                }else if (position == 1) {
                    context.startActivity(new Intent(context, BottomLegLift.class));
                }
                else if (position == 2) {
                    context.startActivity(new Intent(context, LungeJump.class));
                }
                else if (position == 3) {
                    context.startActivity(new Intent(context, SideLegCircle.class));
                }
                else if (position == 4) {
                    context.startActivity(new Intent(context, GluteKickBack.class));
                }
                else if (position == 5) {
                    context.startActivity(new Intent(context, WallSit.class));
                }
                else if (position == 6) {
                    context.startActivity(new Intent(context, LyingButterflyStretch.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return legAdvances.size();
    }

    class LegAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public LegAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

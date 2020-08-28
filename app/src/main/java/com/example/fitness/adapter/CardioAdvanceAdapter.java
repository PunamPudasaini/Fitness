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
import com.example.fitness.dto.CardioAdvance;
import com.example.fitness.exercise.cardio.Burpees;
import com.example.fitness.exercise.cardio.ButtKick;
import com.example.fitness.exercise.cardio.CrabWalk;
import com.example.fitness.exercise.cardio.Diagonal;
import com.example.fitness.exercise.cardio.HighKnees;
import com.example.fitness.exercise.cardio.Inchwom;
import com.example.fitness.exercise.cardio.JumPing;
import com.example.fitness.exercise.cardio.LateralShuffles;
import com.example.fitness.exercise.cardio.Mount;
import com.example.fitness.exercise.cardio.PlankSki;
import com.example.fitness.exercise.cardio.RotationalJack;
import com.example.fitness.exercise.cardio.SpeedSkater;
import com.example.fitness.exercise.cardio.StandingOblique;
import com.example.fitness.exercise.cardio.ToeTap;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class CardioAdvanceAdapter extends RecyclerView.Adapter<CardioAdvanceAdapter.CardioAdvanceViewHolder> {
    Context context;
    ArrayList<CardioAdvance> cardioAdvances;

    public CardioAdvanceAdapter(Context context, ArrayList<CardioAdvance> cardioAdvances) {
        this.context = context;
        this.cardioAdvances = cardioAdvances;
    }

    @NonNull
    @Override
    public CardioAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new CardioAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardioAdvanceViewHolder holder, final int position) {
        holder.textView.setText(cardioAdvances.get(position).getName());
        Glide.with(context).load(cardioAdvances.get(position).getImage()).into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, Mount.class));
                }else if (position == 1) {
                    context.startActivity(new Intent(context, PlankSki.class));
                }
                else if (position == 2) {
                    context.startActivity(new Intent(context, Diagonal.class));
                }
                else if (position == 3) {
                    context.startActivity(new Intent(context, RotationalJack.class));
                }
                else if (position == 4) {
                    context.startActivity(new Intent(context, Burpees.class));
                }
                else if (position == 5) {
                    context.startActivity(new Intent(context, Inchwom.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return cardioAdvances.size();
    }

    class CardioAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public CardioAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

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
import com.example.fitness.dto.CardioInter;
import com.example.fitness.exercise.cardio.BoxJump;
import com.example.fitness.exercise.cardio.ButtKick;
import com.example.fitness.exercise.cardio.CrabWalk;
import com.example.fitness.exercise.cardio.HighKnees;
import com.example.fitness.exercise.cardio.JumPing;
import com.example.fitness.exercise.cardio.LateralShuffles;
import com.example.fitness.exercise.cardio.LungeJump;
import com.example.fitness.exercise.cardio.PlankJack;
import com.example.fitness.exercise.cardio.SpeedSkater;
import com.example.fitness.exercise.cardio.SquatJump;
import com.example.fitness.exercise.cardio.StandingAlter;
import com.example.fitness.exercise.cardio.StandingOblique;
import com.example.fitness.exercise.cardio.ToeTap;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class CardioInterAdapter extends RecyclerView.Adapter<CardioInterAdapter.CardioInterViewHolder> {
    Context context;
    ArrayList<CardioInter> cardioInters;
    public CardioInterAdapter(Context context, ArrayList<CardioInter> cardioInters) {
        this.context = context;
        this.cardioInters = cardioInters;
    }

    @NonNull
    @Override
    public CardioInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new CardioInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardioInterViewHolder holder, final int position) {
        holder.textView.setText(cardioInters.get(position).getName());
        Glide.with(context).load(cardioInters.get(position).getImage()).into(holder.imageView);


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, SquatJump.class));
                }else if (position == 1) {
                    context.startActivity(new Intent(context, StandingAlter.class));
                }
                else if (position == 2) {
                    context.startActivity(new Intent(context, LungeJump.class));
                }
                else if (position == 3) {
                    context.startActivity(new Intent(context, BoxJump.class));
                }
                else if (position == 4) {
                    context.startActivity(new Intent(context, PlankJack.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return cardioInters.size();
    }

    class CardioInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public CardioInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

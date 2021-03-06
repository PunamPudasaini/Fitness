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
import com.example.fitness.dto.Cardio;
import com.example.fitness.exercise.cardio.ButtKick;
import com.example.fitness.exercise.cardio.CrabWalk;
import com.example.fitness.exercise.cardio.HighKnees;
import com.example.fitness.exercise.cardio.JumPing;
import com.example.fitness.exercise.cardio.LateralShuffles;
import com.example.fitness.exercise.cardio.SpeedSkater;
import com.example.fitness.exercise.cardio.StandingOblique;
import com.example.fitness.exercise.cardio.ToeTap;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class CardioAdapter extends RecyclerView.Adapter<CardioAdapter.CardiViewHolder> {
    Context context;
    ArrayList<Cardio> cardios;

    public CardioAdapter(Context context, ArrayList<Cardio> cardios) {
        this.context = context;
        this.cardios = cardios;
    }

    @NonNull
    @Override
    public CardiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new CardiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardiViewHolder holder, final int position) {
        holder.textView.setText(cardios.get(position).getName());
        Glide.with(context).load(cardios.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, HighKnees.class));
                }else if (position == 1) {
                    context.startActivity(new Intent(context, ButtKick.class));
                }
                else if (position == 2) {
                    context.startActivity(new Intent(context, LateralShuffles.class));
                }
                else if (position == 3) {
                    context.startActivity(new Intent(context, CrabWalk.class));
                }
                else if (position == 4) {
                    context.startActivity(new Intent(context, StandingOblique.class));
                }
                else if (position == 5) {
                    context.startActivity(new Intent(context, SpeedSkater.class));
                }
                else if (position == 6) {
                    context.startActivity(new Intent(context, JumPing.class));
                }
                else if (position == 7) {
                    context.startActivity(new Intent(context, ToeTap.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return cardios.size();
    }

    class CardiViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public CardiViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

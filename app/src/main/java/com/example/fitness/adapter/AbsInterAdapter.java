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
import com.example.fitness.dto.AbsInter;
import com.example.fitness.exercise.abs.Abdominal;
import com.example.fitness.exercise.abs.AbsRollOut;
import com.example.fitness.exercise.abs.BirdDog;
import com.example.fitness.exercise.abs.CobraStretch;
import com.example.fitness.exercise.abs.Dumbell;
import com.example.fitness.exercise.abs.HangingKnee;
import com.example.fitness.exercise.abs.HeelTouch;
import com.example.fitness.exercise.abs.JumpingJack;
import com.example.fitness.exercise.abs.LegRaise;
import com.example.fitness.exercise.abs.LegRaises;
import com.example.fitness.exercise.abs.Medicine;
import com.example.fitness.exercise.abs.MountainClimber;
import com.example.fitness.exercise.abs.Plank;
import com.example.fitness.exercise.abs.RussianTwist;
import com.example.fitness.exercise.abs.WalkPlank;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class AbsInterAdapter extends RecyclerView.Adapter<AbsInterAdapter.AbsInterViewHolder> {
    Context context;
    ArrayList<AbsInter> absInters;

    public AbsInterAdapter(Context context, ArrayList<AbsInter> absInters) {
        this.context = context;
        this.absInters = absInters;
    }

    @NonNull
    @Override
    public AbsInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new AbsInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AbsInterViewHolder holder, final int position) {
        holder.textView.setText(absInters.get(position).getName());
        Glide.with(context).load(absInters.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, LegRaise.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, AbsRollOut.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, BirdDog.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, HangingKnee.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, Dumbell.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, Medicine.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, WalkPlank.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return absInters.size();
    }

    class AbsInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public AbsInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

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
import com.example.fitness.dto.ArmInter;
import com.example.fitness.exercise.abs.AbsRollOut;
import com.example.fitness.exercise.abs.BirdDog;
import com.example.fitness.exercise.abs.Dumbell;
import com.example.fitness.exercise.abs.HangingKnee;
import com.example.fitness.exercise.abs.LegRaise;
import com.example.fitness.exercise.abs.Medicine;
import com.example.fitness.exercise.abs.WalkPlank;
import com.example.fitness.exercise.arms.ArmScissor;
import com.example.fitness.exercise.arms.Burpeees;
import com.example.fitness.exercise.arms.FloorTricep;
import com.example.fitness.exercise.arms.MilitaryPushup;
import com.example.fitness.exercise.arms.PushUpRot;
import com.example.fitness.exercise.arms.SkippingWithoutrope;
import com.example.fitness.exercise.arms.StandingBicep2;
import com.example.fitness.exercise.arms.TricepStretch2;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ArmInterAdapter extends RecyclerView.Adapter<ArmInterAdapter.ArmInterViewHolder> {
    Context context;
    ArrayList<ArmInter> armInters;

    public ArmInterAdapter(Context context, ArrayList<ArmInter> armInters) {
        this.context = context;
        this.armInters = armInters;
    }


    @NonNull
    @Override
    public ArmInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ArmInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArmInterViewHolder holder, final int position) {
        holder.textView.setText(armInters.get(position).getName());
        Glide.with(context).load(armInters.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, ArmScissor.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, Burpeees.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, PushUpRot.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, FloorTricep.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, MilitaryPushup.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, TricepStretch2.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, StandingBicep2.class));
                }
                else if (position ==7){
                    context.startActivity(new Intent(context, SkippingWithoutrope.class));
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return armInters.size();
    }

    class ArmInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public ArmInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

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
import com.example.fitness.dto.ArmAdvance;
import com.example.fitness.exercise.abs.AbsRollOut;
import com.example.fitness.exercise.abs.BirdDog;
import com.example.fitness.exercise.abs.Dumbell;
import com.example.fitness.exercise.abs.HangingKnee;
import com.example.fitness.exercise.abs.LegRaise;
import com.example.fitness.exercise.abs.Medicine;
import com.example.fitness.exercise.abs.WalkPlank;
import com.example.fitness.exercise.arms.ArmCurlCrunch;
import com.example.fitness.exercise.arms.ChestPressPulse;
import com.example.fitness.exercise.arms.MilitaryPushup;
import com.example.fitness.exercise.arms.Militarypush2;
import com.example.fitness.exercise.arms.SkippingWithoutRope2;
import com.example.fitness.exercise.arms.StandingBicep2;
import com.example.fitness.exercise.arms.TricepStretch2;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ArmAdvanceAdapter extends RecyclerView.Adapter<ArmAdvanceAdapter.ArmAdvanceViewHolder> {
    Context context;
    ArrayList<ArmAdvance> armAdvances;

    public ArmAdvanceAdapter(Context context, ArrayList<ArmAdvance> armAdvances) {
        this.context = context;
        this.armAdvances = armAdvances;
    }

    @NonNull
    @Override
    public ArmAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ArmAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArmAdvanceViewHolder holder, final int position) {
        holder.textView.setText(armAdvances.get(position).getName());
        Glide.with(context).load(armAdvances.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, ArmCurlCrunch.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, Militarypush2.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, ChestPressPulse.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, TricepStretch2.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, SkippingWithoutRope2.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, StandingBicep2.class));
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return armAdvances.size();
    }

    class ArmAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public ArmAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

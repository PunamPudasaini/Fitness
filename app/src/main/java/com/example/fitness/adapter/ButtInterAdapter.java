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
import com.example.fitness.dto.ButtAdvance;
import com.example.fitness.dto.ButtInter;
import com.example.fitness.exercise.arms.ArmScissor;
import com.example.fitness.exercise.arms.Burpeees;
import com.example.fitness.exercise.arms.FloorTricep;
import com.example.fitness.exercise.arms.MilitaryPushup;
import com.example.fitness.exercise.arms.PushUpRot;
import com.example.fitness.exercise.arms.SkippingWithoutrope;
import com.example.fitness.exercise.arms.StandingBicep2;
import com.example.fitness.exercise.arms.TricepStretch2;
import com.example.fitness.exercise.butt.DiagonalSquat;
import com.example.fitness.exercise.butt.HipDriveStepUp;
import com.example.fitness.exercise.butt.HipThrustSingleArmReach;
import com.example.fitness.exercise.butt.SideLungeShift;
import com.example.fitness.exercise.butt.SideStepUp;
import com.example.fitness.exercise.butt.SingleLegHipLift;
import com.example.fitness.exercise.butt.StepUp;
import com.example.fitness.exercise.butt.WalkingLunge;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ButtInterAdapter extends RecyclerView.Adapter<ButtInterAdapter.ButtInterViewHolder> {
    Context context;
    ArrayList<ButtInter> buttInters;

    public ButtInterAdapter(Context context, ArrayList<ButtInter> buttInters) {
        this.context = context;
        this.buttInters = buttInters;
    }

    @NonNull
    @Override
    public ButtInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ButtInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtInterViewHolder holder, final int position) {
        holder.textView.setText(buttInters.get(position).getName());
        Glide.with(context).load(buttInters.get(position).getImage()).into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, DiagonalSquat.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, HipThrustSingleArmReach.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, StepUp.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, SideLungeShift.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, WalkingLunge.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, SingleLegHipLift.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, HipDriveStepUp.class));
                }
                else if (position ==7){
                    context.startActivity(new Intent(context, SideStepUp.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return buttInters.size();
    }

    class ButtInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public ButtInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

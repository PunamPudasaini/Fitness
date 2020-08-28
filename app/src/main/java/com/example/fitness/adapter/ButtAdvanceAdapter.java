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
import com.example.fitness.exercise.arms.ArmScissor;
import com.example.fitness.exercise.arms.Burpeees;
import com.example.fitness.exercise.arms.FloorTricep;
import com.example.fitness.exercise.arms.MilitaryPushup;
import com.example.fitness.exercise.arms.PushUpRot;
import com.example.fitness.exercise.arms.SkippingWithoutrope;
import com.example.fitness.exercise.arms.StandingBicep2;
import com.example.fitness.exercise.arms.TricepStretch2;
import com.example.fitness.exercise.butt.BottomUpLungeToCrossOver;
import com.example.fitness.exercise.butt.PowerSkip;
import com.example.fitness.exercise.butt.RearFootDeadlift;
import com.example.fitness.exercise.butt.RearFootSquat;
import com.example.fitness.exercise.butt.SingleLegDeadlift;
import com.example.fitness.exercise.butt.SingleLegSquatReachAcross;
import com.example.fitness.exercise.butt.SupportedSingleLegSquat;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ButtAdvanceAdapter extends RecyclerView.Adapter<ButtAdvanceAdapter.ButtAdvanceViewHolder> {
    Context context;
    ArrayList<ButtAdvance> buttAdvances;

    public ButtAdvanceAdapter(Context context, ArrayList<ButtAdvance> buttAdvances) {
        this.context = context;
        this.buttAdvances = buttAdvances;
    }

    @NonNull
    @Override
    public ButtAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ButtAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtAdvanceViewHolder holder, final int position) {
        holder.textView.setText(buttAdvances.get(position).getName());
        Glide.with(context).load(buttAdvances.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, BottomUpLungeToCrossOver.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, SupportedSingleLegSquat.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, SingleLegDeadlift.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, PowerSkip.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, RearFootSquat.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, RearFootDeadlift.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, SingleLegSquatReachAcross.class));
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return buttAdvances.size();
    }

    class ButtAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public ButtAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

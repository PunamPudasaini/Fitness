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
import com.example.fitness.dto.Arm;
import com.example.fitness.dto.Butt;
import com.example.fitness.exercise.arms.ArmScissor;
import com.example.fitness.exercise.arms.Burpeees;
import com.example.fitness.exercise.arms.FloorTricep;
import com.example.fitness.exercise.arms.MilitaryPushup;
import com.example.fitness.exercise.arms.PushUpRot;
import com.example.fitness.exercise.arms.SkippingWithoutrope;
import com.example.fitness.exercise.arms.StandingBicep2;
import com.example.fitness.exercise.arms.TricepStretch2;
import com.example.fitness.exercise.butt.BottomupLunge;
import com.example.fitness.exercise.butt.ChairSquatJump;
import com.example.fitness.exercise.butt.GluteBridge;
import com.example.fitness.exercise.butt.HipDrive;
import com.example.fitness.exercise.butt.HipThrust;
import com.example.fitness.exercise.butt.MarchingHipLifts;
import com.example.fitness.exercise.butt.SideSkater;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ButtAdapter extends RecyclerView.Adapter<ButtAdapter.ButtViewHolder> {
    Context context;
    ArrayList<Butt> butts;

    public ButtAdapter(Context context, ArrayList<Butt> butts) {
        this.context = context;
        this.butts = butts;
    }

    @NonNull
    @Override
    public ButtViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ButtViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtViewHolder holder, final int position) {
        holder.textView.setText(butts.get(position).getName());
        Glide.with(context).load(butts.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, HipDrive.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, BottomupLunge.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, HipThrust.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, GluteBridge.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, SideSkater.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, MarchingHipLifts.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, ChairSquatJump.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return butts.size();
    }

    class ButtViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public ButtViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

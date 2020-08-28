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
import com.example.fitness.dto.Leg;
import com.example.fitness.exercise.leg.BottomLegLift;
import com.example.fitness.exercise.leg.CalfStretch;
import com.example.fitness.exercise.leg.DonkeyKick;
import com.example.fitness.exercise.leg.DonkeyKick2;
import com.example.fitness.exercise.leg.GluteKickBack;
import com.example.fitness.exercise.leg.JumpingSquat;
import com.example.fitness.exercise.leg.LungeJump;
import com.example.fitness.exercise.leg.LyingButterflyStretch;
import com.example.fitness.exercise.leg.QuadStretchWithWall;
import com.example.fitness.exercise.leg.SideHop;
import com.example.fitness.exercise.leg.SideLegCircle;
import com.example.fitness.exercise.leg.Squats;
import com.example.fitness.exercise.leg.SumoSquatCalfRaise;
import com.example.fitness.exercise.leg.WallCalfRaises;
import com.example.fitness.exercise.leg.WallSit;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class LegAdapter extends RecyclerView.Adapter<LegAdapter.LegViewHolder>{
    Context context;
    ArrayList<Leg> legs;

    public LegAdapter(Context context, ArrayList<Leg> legs) {
        this.context = context;
        this.legs = legs;
    }


    @NonNull
    @Override
    public LegViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new LegViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LegViewHolder holder, final int position) {
        holder.textView.setText(legs.get(position).getName());
        Glide.with(context).load(legs.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, SideHop.class));
                }else if (position == 1) {
                    context.startActivity(new Intent(context, Squats.class));
                }
                else if (position == 2) {
                    context.startActivity(new Intent(context, DonkeyKick.class));
                }
                else if (position == 3) {
                    context.startActivity(new Intent(context, QuadStretchWithWall.class));
                }
                else if (position == 4) {
                    context.startActivity(new Intent(context, WallCalfRaises.class));
                }
                else if (position == 5) {
                    context.startActivity(new Intent(context, CalfStretch.class));
                }
                else if (position == 6) {
                    context.startActivity(new Intent(context, SumoSquatCalfRaise.class));
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return legs.size();
    }

    class LegViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public LegViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

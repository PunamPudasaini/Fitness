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
import com.example.fitness.dto.LegInter;
import com.example.fitness.exercise.leg.BottomLegLift;
import com.example.fitness.exercise.leg.CalfRaiseWithSplayedFoot;
import com.example.fitness.exercise.leg.GluteKickBack;
import com.example.fitness.exercise.leg.JumpingSquat;
import com.example.fitness.exercise.leg.LungeJump;
import com.example.fitness.exercise.leg.Lunges;
import com.example.fitness.exercise.leg.LyingButterflyStretch;
import com.example.fitness.exercise.leg.QuadStretchWithWall2;
import com.example.fitness.exercise.leg.ReverseFlutterKick;
import com.example.fitness.exercise.leg.SideLegCircle;
import com.example.fitness.exercise.leg.SideLegCircle2;
import com.example.fitness.exercise.leg.WallSit;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class LegInterAdapter extends RecyclerView.Adapter<LegInterAdapter.LegInterViewHolder> {
    Context context;
    ArrayList<LegInter> legInters;

    public LegInterAdapter(Context context, ArrayList<LegInter> legInters) {
        this.context = context;
        this.legInters = legInters;
    }

    @NonNull
    @Override
    public LegInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new LegInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LegInterViewHolder holder, final int position) {
        holder.textView.setText(legInters.get(position).getName());
        Glide.with(context).load(legInters.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, Lunges.class));
                }else if (position == 1) {
                    context.startActivity(new Intent(context, SideLegCircle2.class));
                }
                else if (position == 2) {
                    context.startActivity(new Intent(context, ReverseFlutterKick.class));
                }
                else if (position == 3) {
                    context.startActivity(new Intent(context, QuadStretchWithWall2.class));
                }
                else if (position == 4) {
                    context.startActivity(new Intent(context, CalfRaiseWithSplayedFoot.class));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return legInters.size();
    }

    class LegInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public LegInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

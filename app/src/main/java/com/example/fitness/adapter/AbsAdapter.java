package com.example.fitness.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitness.R;
import com.example.fitness.dto.Abs;
import com.example.fitness.exercise.beginner.Abdominal;
import com.example.fitness.exercise.beginner.CobraStretch;
import com.example.fitness.exercise.beginner.HeelTouch;
import com.example.fitness.exercise.beginner.JumpingJack;
import com.example.fitness.exercise.beginner.LegRaises;
import com.example.fitness.exercise.beginner.MountainClimber;
import com.example.fitness.exercise.beginner.Plank;
import com.example.fitness.exercise.beginner.RussianTwist;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class AbsAdapter extends RecyclerView.Adapter<AbsAdapter.AbsViewHolder> {
    private Context context;
    private ArrayList<Abs> absArrayList;
    public AbsAdapter(Context context, ArrayList<Abs> absArrayList) {
        this.context = context;
        this.absArrayList = absArrayList;
    }

    @NonNull
    @Override
    public AbsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new AbsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AbsViewHolder holder, final int position) {
        holder.textView.setText(absArrayList.get(position).getName());
        //holder.imageView.setImageDrawable(context.getResources().getDrawable(absArrayList.get(position).getImage()));
        //Glide.with(context).load(R.drawable.jumpingjack).into(holder.imageView);
        Glide.with(context).load(absArrayList.get(position).getImage()).into(holder.imageView);


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, JumpingJack.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, MountainClimber.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, LegRaises.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, RussianTwist.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, Abdominal.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, Plank.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, HeelTouch.class));
                }
                else if (position ==7){
                    context.startActivity(new Intent(context, CobraStretch.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return absArrayList.size();
    }

    class AbsViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public AbsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

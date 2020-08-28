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
import com.example.fitness.dto.ArmAdvance;
import com.example.fitness.exercise.abs.AbsRollOut;
import com.example.fitness.exercise.abs.BirdDog;
import com.example.fitness.exercise.abs.Dumbell;
import com.example.fitness.exercise.abs.HangingKnee;
import com.example.fitness.exercise.abs.LegRaise;
import com.example.fitness.exercise.abs.Medicine;
import com.example.fitness.exercise.abs.WalkPlank;
import com.example.fitness.exercise.arms.ArmCircleClockwise;
import com.example.fitness.exercise.arms.ArmRaises;
import com.example.fitness.exercise.arms.BarbellCurl;
import com.example.fitness.exercise.arms.PushUpss;
import com.example.fitness.exercise.arms.StandingBicep;
import com.example.fitness.exercise.arms.TricepDip;
import com.example.fitness.exercise.arms.TricepStretch;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ArmAdapter extends RecyclerView.Adapter<ArmAdapter.ArmViewHolder> {
    Context context;
    ArrayList<Arm> arms;

    public ArmAdapter(Context context, ArrayList<Arm> arms) {
        this.context = context;
        this.arms = arms;
    }

    @NonNull
    @Override
    public ArmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ArmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArmViewHolder holder, final int position) {
        holder.textView.setText(arms.get(position).getName());
        Glide.with(context).load(arms.get(position).getImage()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    context.startActivity(new Intent(context, ArmRaises.class));
                } else if (position ==1) {
                    context.startActivity(new Intent(context, ArmCircleClockwise.class));
                }
                else if (position ==2){
                    context.startActivity(new Intent(context, BarbellCurl.class));
                }
                else if (position ==3){
                    context.startActivity(new Intent(context, PushUpss.class));
                }
                else if (position ==4){
                    context.startActivity(new Intent(context, TricepDip.class));
                }
                else if (position ==5){
                    context.startActivity(new Intent(context, TricepStretch.class));
                }
                else if (position ==6){
                    context.startActivity(new Intent(context, StandingBicep.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return arms.size();
    }

    class ArmViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        GifImageView imageView;
        TextView textView;

       public ArmViewHolder(@NonNull View itemView) {
           super(itemView);
           imageView = itemView.findViewById(R.id.img);
           textView = itemView.findViewById(R.id.text);
           cardView = itemView.findViewById(R.id.cardview);
       }
   }
}

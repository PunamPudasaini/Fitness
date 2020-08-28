package com.example.fitness.adapter;

import android.content.Context;
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
    public void onBindViewHolder(@NonNull ArmAdvanceViewHolder holder, int position) {
        holder.textView.setText(armAdvances.get(position).getName());
        Glide.with(context).load(armAdvances.get(position).getImage()).into(holder.imageView);

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

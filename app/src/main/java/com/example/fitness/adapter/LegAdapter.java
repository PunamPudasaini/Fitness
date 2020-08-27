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
import com.example.fitness.dto.Leg;

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
    public void onBindViewHolder(@NonNull LegViewHolder holder, int position) {
        holder.textView.setText(legs.get(position).getName());
        Glide.with(context).load(legs.get(position).getImage()).into(holder.imageView);

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

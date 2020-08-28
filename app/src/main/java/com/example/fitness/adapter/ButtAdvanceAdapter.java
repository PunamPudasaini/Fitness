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
import com.example.fitness.dto.ButtAdvance;

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
    public void onBindViewHolder(@NonNull ButtAdvanceViewHolder holder, int position) {
        holder.textView.setText(buttAdvances.get(position).getName());
        Glide.with(context).load(buttAdvances.get(position).getImage()).into(holder.imageView);

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

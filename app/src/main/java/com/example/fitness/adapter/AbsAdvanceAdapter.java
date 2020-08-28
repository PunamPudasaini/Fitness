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
import com.example.fitness.dto.AbsAdvance;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class AbsAdvanceAdapter extends RecyclerView.Adapter<AbsAdvanceAdapter.AbsAdvanceViewHolder> {
    Context context;
    ArrayList<AbsAdvance> absAdvances;

    public AbsAdvanceAdapter(Context context, ArrayList<AbsAdvance> absAdvances) {
        this.context = context;
        this.absAdvances = absAdvances;
    }

    @NonNull
    @Override
    public AbsAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new AbsAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AbsAdvanceViewHolder holder, int position) {
        holder.textView.setText(absAdvances.get(position).getName());
        Glide.with(context).load(absAdvances.get(position).getImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return absAdvances.size();
    }

    class AbsAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public AbsAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

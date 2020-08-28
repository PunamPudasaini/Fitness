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
import com.example.fitness.dto.LegAdvance;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class LegAdvanceAdapter extends RecyclerView.Adapter<LegAdvanceAdapter.LegAdvanceViewHolder> {
    Context context;
    ArrayList<LegAdvance> legAdvances;

    public LegAdvanceAdapter(Context context, ArrayList<LegAdvance> legAdvances) {
        this.context = context;
        this.legAdvances = legAdvances;
    }

    @NonNull
    @Override
    public LegAdvanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new LegAdvanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LegAdvanceViewHolder holder, int position) {
        holder.textView.setText(legAdvances.get(position).getName());
        Glide.with(context).load(legAdvances.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return legAdvances.size();
    }

    class LegAdvanceViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public LegAdvanceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

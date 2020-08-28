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
import com.example.fitness.dto.LegInter;

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
    public void onBindViewHolder(@NonNull LegInterViewHolder holder, int position) {
        holder.textView.setText(legInters.get(position).getName());
        Glide.with(context).load(legInters.get(position).getImage()).into(holder.imageView);


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

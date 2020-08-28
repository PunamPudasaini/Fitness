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
import com.example.fitness.dto.AbsInter;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class AbsInterAdapter extends RecyclerView.Adapter<AbsInterAdapter.AbsInterViewHolder> {
    Context context;
    ArrayList<AbsInter> absInters;

    public AbsInterAdapter(Context context, ArrayList<AbsInter> absInters) {
        this.context = context;
        this.absInters = absInters;
    }

    @NonNull
    @Override
    public AbsInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new AbsInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AbsInterViewHolder holder, int position) {
        holder.textView.setText(absInters.get(position).getName());
        Glide.with(context).load(absInters.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return absInters.size();
    }

    class AbsInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public AbsInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

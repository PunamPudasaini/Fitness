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
import com.example.fitness.dto.ButtInter;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ButtInterAdapter extends RecyclerView.Adapter<ButtInterAdapter.ButtInterViewHolder> {
    Context context;
    ArrayList<ButtInter> buttInters;

    public ButtInterAdapter(Context context, ArrayList<ButtInter> buttInters) {
        this.context = context;
        this.buttInters = buttInters;
    }

    @NonNull
    @Override
    public ButtInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ButtInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtInterViewHolder holder, int position) {
        holder.textView.setText(buttInters.get(position).getName());
        Glide.with(context).load(buttInters.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return buttInters.size();
    }

    class ButtInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public ButtInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

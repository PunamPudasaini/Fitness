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
import com.example.fitness.dto.ArmInter;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ArmInterAdapter extends RecyclerView.Adapter<ArmInterAdapter.ArmInterViewHolder> {
    Context context;
    ArrayList<ArmInter> armInters;

    public ArmInterAdapter(Context context, ArrayList<ArmInter> armInters) {
        this.context = context;
        this.armInters = armInters;
    }


    @NonNull
    @Override
    public ArmInterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ArmInterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArmInterViewHolder holder, int position) {
        holder.textView.setText(armInters.get(position).getName());
        Glide.with(context).load(armInters.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return armInters.size();
    }

    class ArmInterViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;
        public ArmInterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

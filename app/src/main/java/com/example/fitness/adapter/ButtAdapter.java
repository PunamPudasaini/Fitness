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
import com.example.fitness.dto.Arm;
import com.example.fitness.dto.Butt;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ButtAdapter extends RecyclerView.Adapter<ButtAdapter.ButtViewHolder> {
    Context context;
    ArrayList<Butt> butts;

    public ButtAdapter(Context context, ArrayList<Butt> butts) {
        this.context = context;
        this.butts = butts;
    }

    @NonNull
    @Override
    public ButtViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ButtViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtViewHolder holder, int position) {
        holder.textView.setText(butts.get(position).getName());
        Glide.with(context).load(butts.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return butts.size();
    }

    class ButtViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public ButtViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

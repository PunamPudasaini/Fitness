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
import com.example.fitness.dto.Cardio;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class CardioAdapter extends RecyclerView.Adapter<CardioAdapter.CardiViewHolder> {
    Context context;
    ArrayList<Cardio> cardios;

    public CardioAdapter(Context context, ArrayList<Cardio> cardios) {
        this.context = context;
        this.cardios = cardios;
    }

    @NonNull
    @Override
    public CardiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new CardiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardiViewHolder holder, int position) {
        holder.textView.setText(cardios.get(position).getName());
        Glide.with(context).load(cardios.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return cardios.size();
    }

    class CardiViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        GifImageView imageView;
        TextView textView;

        public CardiViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}

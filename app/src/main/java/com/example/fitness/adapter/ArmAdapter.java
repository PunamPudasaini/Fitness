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

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ArmAdapter extends RecyclerView.Adapter<ArmAdapter.ArmViewHolder> {
    Context context;
    ArrayList<Arm> arms;

    public ArmAdapter(Context context, ArrayList<Arm> arms) {
        this.context = context;
        this.arms = arms;
    }

    @NonNull
    @Override
    public ArmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abs_design,parent,false);
        return new ArmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArmViewHolder holder, int position) {
        holder.textView.setText(arms.get(position).getName());
        Glide.with(context).load(arms.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return arms.size();
    }

    class ArmViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        GifImageView imageView;
        TextView textView;

       public ArmViewHolder(@NonNull View itemView) {
           super(itemView);
           imageView = itemView.findViewById(R.id.img);
           textView = itemView.findViewById(R.id.text);
           cardView = itemView.findViewById(R.id.cardview);
       }
   }
}

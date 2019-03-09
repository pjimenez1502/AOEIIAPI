package com.example.jimen.aoeiiapi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jimen.aoeiiapi.Model.Civilization;

import java.util.ArrayList;
import java.util.List;

public class CivsAdapter extends RecyclerView.Adapter<CivsAdapter.CivsViewHolder> {
    public List<Civilization> civList = new ArrayList<>();

    @NonNull
    @Override
    public CivsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(x, parent,false);
        return new CivsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CivsViewHolder holder, int position) {
        Civilization civ = civList.get(position);

        holder.
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CivsViewHolder extends RecyclerView.ViewHolder {

        public CivsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

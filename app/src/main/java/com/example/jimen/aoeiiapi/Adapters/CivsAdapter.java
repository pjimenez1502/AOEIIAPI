package com.example.jimen.aoeiiapi.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jimen.aoeiiapi.Model.Civilization;
import com.example.jimen.aoeiiapi.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CivsAdapter extends RecyclerView.Adapter<CivsAdapter.CivsViewHolder> {
    public List<Civilization> civList = new ArrayList<>();

    @NonNull
    @Override
    public CivsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_civ, parent,false);
        return new CivsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CivsViewHolder holder, int position) {
        Civilization civ = civList.get(position);

        holder.civName.setText(civ.name);
        holder.civExpansion.setText(civ.expansion);
        holder.civArmy.setText(civ.army_type);
        holder.civUnit.setText(civ.unique_unit[0]);
        holder.civTech.setText(civ.unique_tech[0]);
        holder.civTBonus.setText(civ.team_bonus);
        holder.civCBonus.setText(Arrays.toString(civ.civilization_bonus));

    }

    @Override
    public int getItemCount() {
        System.out.println("----------------------------------------------"+civList.size());
        return civList.size();
    }

    public class CivsViewHolder extends RecyclerView.ViewHolder {

        TextView civName;
        TextView civExpansion;
        TextView civArmy;
        TextView civUnit;
        TextView civTech;
        TextView civTBonus;
        TextView civCBonus;

        public CivsViewHolder(@NonNull View itemView) {
            super(itemView);

            civName = itemView.findViewById(R.id.civ_name);
            civExpansion = itemView.findViewById(R.id.civ_expansion);
            civArmy = itemView.findViewById(R.id.civ_army);
            civUnit = itemView.findViewById(R.id.civ_unit);
            civTech = itemView.findViewById(R.id.civ_tech);
            civTBonus = itemView.findViewById(R.id.civ_tbonus);
            civCBonus = itemView.findViewById(R.id.civ_cbonus);
        }
    }
}

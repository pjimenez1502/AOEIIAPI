package com.example.jimen.aoeiiapi.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jimen.aoeiiapi.Model.Structure;
import com.example.jimen.aoeiiapi.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StructuresAdapter extends RecyclerView.Adapter<StructuresAdapter.StructuresViewHolder> {
    public List<Structure> strList = new ArrayList<>();

    @NonNull
    @Override
    public StructuresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.structure_item, parent, false);
        return new StructuresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StructuresViewHolder holder, int position) {
        Structure str = strList.get(position);

        holder.strName.setText(str.name);
        holder.strExpansion.setText(str.expansion);
        holder.strAge.setText(str.age);
        holder.strCost.setText(Arrays.toString(str.cost));
    }

    @Override
    public int getItemCount() {
        System.out.println("----------------------------------------------"+strList.size());
        return strList.size();
    }

    public class StructuresViewHolder extends RecyclerView.ViewHolder {

        TextView strName;
        TextView strExpansion;
        TextView strAge;
        TextView strCost;

        public StructuresViewHolder(@NonNull View itemView) {
            super(itemView);

            strName = itemView.findViewById(R.id.str_name);
            strExpansion = itemView.findViewById(R.id.str_exp);
            strAge = itemView.findViewById(R.id.str_age);
            strCost = itemView.findViewById(R.id.str_cost);
        }
    }
}

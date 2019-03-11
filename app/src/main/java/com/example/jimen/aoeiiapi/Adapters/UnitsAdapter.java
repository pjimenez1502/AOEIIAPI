package com.example.jimen.aoeiiapi.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jimen.aoeiiapi.Model.Unit;
import com.example.jimen.aoeiiapi.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitsAdapter extends RecyclerView.Adapter<UnitsAdapter.UnitsViewHolder> {
    public List<Unit> unitList = new ArrayList<>();

    @NonNull
    @Override
    public UnitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_unit, parent, false);
        return new UnitsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UnitsViewHolder holder, int position) {
        Unit unit = unitList.get(position);

        holder.unitName.setText(unit.name);
        holder.unitDesc.setText(unit.description);
        holder.unitAge.setText(unit.age);
        holder.unitCrIn.setText(unit.created_in);
        holder.cost.setText("Food: " + unit.cost.Food + " / " +
                            "Wood: " + unit.cost.Wood + " / " +
                            "Gold: " + unit.cost.Gold + " / " +
                            "Stone: " + unit.cost.Stone);
    }

    @Override
    public int getItemCount() {
        return unitList.size();
    }


    public class UnitsViewHolder extends RecyclerView.ViewHolder {

        TextView unitName;
        TextView unitDesc;
        TextView unitAge;
        TextView unitCrIn;
        TextView cost;

        public UnitsViewHolder(@NonNull View itemView) {
            super(itemView);

            unitName = itemView.findViewById(R.id.unit_name);
            unitDesc = itemView.findViewById(R.id.unit_description);
            unitAge = itemView.findViewById(R.id.unit_age);
            unitCrIn = itemView.findViewById(R.id.unit_creatin);
            cost = itemView.findViewById(R.id.unit_cost);
        }
    }
}

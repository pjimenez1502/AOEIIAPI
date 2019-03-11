package com.example.jimen.aoeiiapi.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jimen.aoeiiapi.Model.Tech;
import com.example.jimen.aoeiiapi.R;

import java.util.ArrayList;
import java.util.List;

public class TechAdapter extends RecyclerView.Adapter<TechAdapter.TechsViewHolder> {
    public List<Tech> techList = new ArrayList<>();

    @NonNull
    @Override
    public TechsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tech_item, parent, false);
        return new TechsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TechsViewHolder holder, int position) {
        Tech tech = techList.get(position);

        holder.techName.setText(tech.name);
        holder.techDesc.setText(tech.description);
        holder.techExp.setText(tech.expansion);
        holder.techAge.setText(tech.age);
        holder.techCost.setText("Food: " + tech.cost.Food + " / " +
                "Wood: " + tech.cost.Wood + " / " +
                "Gold: " + tech.cost.Gold + " / " +
                "Stone: " + tech.cost.Stone);
    }

    @Override
    public int getItemCount() {
        return techList.size();
    }

    public class TechsViewHolder extends RecyclerView.ViewHolder{

        TextView techName;
        TextView techDesc;
        TextView techExp;
        TextView techAge;
        TextView techCost;

        public TechsViewHolder(@NonNull View itemView) {
            super(itemView);

            techName = itemView.findViewById(R.id.tech_name);
            techDesc = itemView.findViewById(R.id.tech_desc);
            techExp = itemView.findViewById(R.id.tech_exp);
            techAge = itemView.findViewById(R.id.tech_age);
            techCost = itemView.findViewById(R.id.tech_cost);
        }
    }
}

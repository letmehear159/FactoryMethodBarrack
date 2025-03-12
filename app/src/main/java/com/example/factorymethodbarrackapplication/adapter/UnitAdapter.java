package com.example.factorymethodbarrackapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.factorymethodbarrackapplication.R;
import com.example.factorymethodbarrackapplication.entity.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnitAdapter extends RecyclerView.Adapter {

    private Map<String, Unit> units;
    private List<Unit> unitList;

    private Context context;

    public UnitAdapter(Map<String, Unit> units, Context context) {
        this.units = units;
        this.context = context;
        this.unitList = new ArrayList<>(units.values());
    }


    @NonNull
    @Override
    public UnitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_unit, parent, false);
        return new UnitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Unit unit = unitList.get(position);
        holder.itemView.findViewById(R.id.ivUnit).setBackgroundResource(context.getResources().getIdentifier(unit.getIcon(), "drawable", context.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return units.size();
    }

    public static class UnitViewHolder extends RecyclerView.ViewHolder {
        ImageView ivUnit;

        public UnitViewHolder(@NonNull View itemView) {
            super(itemView);
            ivUnit = itemView.findViewById(R.id.ivUnit);
        }
    }
}

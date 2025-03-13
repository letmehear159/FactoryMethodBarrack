package com.example.factorymethodbarrackapplication.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.factorymethodbarrackapplication.R;
import com.example.factorymethodbarrackapplication.entity.Unit;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class UnitAdapter extends RecyclerView.Adapter {

    private Map<String, Unit> units;
    private List<Unit> unitList;

    private Context context;

    private ProgressBar trainingProgress;
    private CountDownTimer trainingTimer;
    ImageView ivUnit;

    private MediaPlayer mediaPlayer;

    public UnitAdapter(Map<String, Unit> units, Context context, ProgressBar progressBar, ImageView ivUnit) {
        this.trainingProgress = progressBar;
        this.units = units;
        this.context = context;
        this.unitList = new ArrayList<>(units.values());
        this.ivUnit = ivUnit;

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
        holder.itemView.findViewById(R.id.ivUnit).setOnClickListener(v -> {
            trainUnit(unit);

        });
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

    private void trainUnit(Unit unit) {
        if (trainingTimer != null) {
            trainingTimer.cancel();
        }
        mediaPlayer = MediaPlayer.create(context, context.getResources().getIdentifier(unit.getIcon(), "raw", context.getPackageName()));
        ivUnit.setVisibility(View.VISIBLE);
        ivUnit.setBackgroundResource(context.getResources().getIdentifier(unit.getIcon(), "drawable", context.getPackageName()));
        // Chuyển trainingTime từ giây sang mili-giây
        long trainingTimeMillis = (long) (unit.getTrainingTime() * 1000);
        trainingProgress.setMax(100); // Đặt max là 100%
        trainingProgress.setProgress(0); // Reset về 0 khi bắt đầu
        trainingProgress.setVisibility(View.VISIBLE);
        // Tạo CountDownTimer để cập nhật ProgressBar
        trainingTimer = new CountDownTimer(trainingTimeMillis, 100) { // Cập nhật mỗi 100ms
            @Override
            public void onTick(long millisUntilFinished) {
                // Tính phần trăm hoàn thành
                int progress = (int) (((trainingTimeMillis - millisUntilFinished) * 100) / trainingTimeMillis);
                trainingProgress.setProgress(progress);
            }

            @Override
            public void onFinish() {
                trainingProgress.setProgress(0);
                trainingProgress.setVisibility(View.INVISIBLE);
                ivUnit.setVisibility(View.INVISIBLE);
                mediaPlayer.start();
                Snackbar snackbar = Snackbar.make(ivUnit, "Training " + unit.getName() + " complete!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        };

        // Bắt đầu huấn luyện
        trainingTimer.start();
    }
}

package com.example.factorymethodbarrackapplication.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.factorymethodbarrackapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView trainUnit = findViewById(R.id.cvTrainUnit);
        CardView units = findViewById(R.id.cvUnits);
        trainUnit.setOnClickListener(v -> {
            Intent intent = new Intent(this, GarrisonActivity.class);
            startActivity(intent);
        });
        units.setOnClickListener(v -> {
            Intent intent = new Intent(this, GarrisonActivity.class);
        });
    }
}
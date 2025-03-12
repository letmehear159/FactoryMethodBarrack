package com.example.factorymethodbarrackapplication.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.factorymethodbarrackapplication.R;
import com.example.factorymethodbarrackapplication.adapter.UnitAdapter;
import com.example.factorymethodbarrackapplication.entity.Unit;
import com.example.factorymethodbarrackapplication.entity.creator.Barrack;
import com.example.factorymethodbarrackapplication.entity.creator.Garrison;

import java.util.HashMap;
import java.util.Map;

public class BarrackActivity extends AppCompatActivity {

    private RecyclerView unitRecycleView;

    private UnitAdapter unitAdapter;
    Map<String, Unit> squad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_barrack);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.barrack), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                squad = (HashMap<String, Unit>) bundle.getSerializable("squad");
            }
        }

        unitAdapter = new UnitAdapter(squad, this);

        unitRecycleView = findViewById(R.id.rvUnit);
        unitRecycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        unitRecycleView.setAdapter(unitAdapter);

    }


}

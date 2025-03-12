package com.example.factorymethodbarrackapplication.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.factorymethodbarrackapplication.R;
import com.example.factorymethodbarrackapplication.adapter.UnitAdapter;
import com.example.factorymethodbarrackapplication.entity.Unit;
import com.example.factorymethodbarrackapplication.entity.creator.ArcaneSanctum;
import com.example.factorymethodbarrackapplication.entity.creator.Barrack;
import com.example.factorymethodbarrackapplication.entity.creator.Garrison;
import com.example.factorymethodbarrackapplication.entity.creator.GryphonAviary;
import com.example.factorymethodbarrackapplication.entity.creator.WorkShop;

import java.util.HashMap;

public class GarrisonActivity extends AppCompatActivity {

    Garrison garrison;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_garrison);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.garrison), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView barrack = findViewById(R.id.cvBarrack);
        CardView arcaneSanctum = findViewById(R.id.cvArcaneSanctum);
        CardView workShop = findViewById(R.id.cvWorkShop);
        CardView aviary = findViewById(R.id.cvAviary);
        barrack.setOnClickListener(v -> {
            garrison = new Barrack();
            Intent intent = new Intent(this, BarrackActivity.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("squad", (HashMap) garrison.getSquad());
            intent.putExtras(bundle);
            startActivity(intent);
        });
        arcaneSanctum.setOnClickListener(v -> {
            garrison = new ArcaneSanctum();
            Intent intent = new Intent(this, BarrackActivity.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("squad", (HashMap) garrison.getSquad());
            intent.putExtras(bundle);
            startActivity(intent);
        });
        workShop.setOnClickListener(v -> {
            garrison = new WorkShop();
            Intent intent = new Intent(this, BarrackActivity.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("squad", (HashMap) garrison.getSquad());
            intent.putExtras(bundle);
            startActivity(intent);
        });
        aviary.setOnClickListener(v -> {
            garrison = new GryphonAviary();
            Intent intent = new Intent(this, BarrackActivity.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("squad", (HashMap) garrison.getSquad());
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}

package com.example.factorymethodbarrackapplication.entity.product;

import com.example.factorymethodbarrackapplication.entity.Unit;

import java.util.HashMap;

public class AviarySquad extends Squad {
    public AviarySquad() {
        units = new HashMap<>();
        Unit gryphonRider = Unit.builder()
                .name("GryphonRider")
                .goldCost(280)
                .lumberCost(70)
                .trainingTime(45)
                .icon("footman")
                .resourceCost(4)
                .build();
        Unit dragonHawkRider = Unit.builder()
                .name("DragonHawkRider")
                .goldCost(200)
                .lumberCost(30)
                .trainingTime(28)
                .icon("footman")
                .resourceCost(3)
                .build();
        units.put("gryphonRider", gryphonRider);
        units.put("dragonHawkRider", dragonHawkRider);
    }
}

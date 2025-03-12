package com.example.factorymethodbarrackapplication.entity.product;

import com.example.factorymethodbarrackapplication.entity.Unit;

import java.util.HashMap;

public class BarrackSquad extends Squad {
    public BarrackSquad() {

        units = new HashMap<>();

        Unit footMan = Unit.builder()
                .name("FootMan")
                .goldCost(135)
                .lumberCost(0)
                .trainingTime(20)
                .icon("footman")
                .resourceCost(2)
                .build();
        Unit rifleMan = Unit.builder()
                .name("RifleMan")
                .goldCost(205)
                .lumberCost(30)
                .trainingTime(26)
                .icon("footman")
                .resourceCost(3)
                .build();
        Unit knight = Unit.builder()
                .name("Knight")
                .goldCost(245)
                .lumberCost(60)
                .trainingTime(45)
                .icon("footman")
                .resourceCost(4)
                .build();

        units.put("footman", footMan);
        units.put("rifleman", rifleMan);
        units.put("knight", knight);
    }
}

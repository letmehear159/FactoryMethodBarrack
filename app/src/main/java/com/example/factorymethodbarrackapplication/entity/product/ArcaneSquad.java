package com.example.factorymethodbarrackapplication.entity.product;


import com.example.factorymethodbarrackapplication.entity.Unit;

import java.util.HashMap;

public class ArcaneSquad extends Squad {
    public ArcaneSquad() {
        units = new HashMap<>();
        Unit priest = Unit.builder()
                .name("Priest")
                .goldCost(135)
                .lumberCost(10)
                .trainingTime(28)
                .icon("footman")
                .resourceCost(2)
                .build();
        Unit sorceress = Unit.builder()
                .name("Sorceress")
                .goldCost(155)
                .lumberCost(20)
                .trainingTime(30)
                .icon("footman")
                .resourceCost(2)
                .build();
        Unit spellBreaker = Unit.builder()
                .name("SpellBreaker")
                .goldCost(215)
                .lumberCost(30)
                .trainingTime(28)
                .icon("footman")
                .resourceCost(3)
                .build();
        units.put("priest", priest);
        units.put("sorceress", sorceress);
        units.put("spellBreaker", spellBreaker);
    }
}
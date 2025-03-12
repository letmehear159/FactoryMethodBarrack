package com.example.factorymethodbarrackapplication.entity.product;

import com.example.factorymethodbarrackapplication.entity.Unit;

import java.util.HashMap;

public class WorkShopSquad extends Squad {
    public WorkShopSquad() {
        units = new HashMap<>();
        Unit flyingMachine = Unit.builder()
                .name("FlyingMachine")
                .goldCost(90)
                .lumberCost(30)
                .trainingTime(13)
                .icon("flyingmachine")
                .resourceCost(1)
                .build();
        Unit mortarTeam = Unit.builder()
                .name("MortarTeam")
                .goldCost(180)
                .lumberCost(70)
                .trainingTime(40)
                .icon("mortarteam")
                .resourceCost(3)
                .build();

        Unit siegeEngine = Unit.builder()
                .name("SiegeEngine")
                .goldCost(195)
                .lumberCost(60)
                .trainingTime(55)
                .icon("siegeengine")
                .resourceCost(3)
                .build();

        units.put("flyingMachine", flyingMachine);
        units.put("mortarTeam", mortarTeam);
        units.put("siegeEngine", siegeEngine);
    }
}

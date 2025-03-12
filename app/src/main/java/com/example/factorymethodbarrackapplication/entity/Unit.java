package com.example.factorymethodbarrackapplication.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class Unit {
    private String name;

    private float trainingTime;

    private int goldCost;

    private int lumberCost;

    public String icon;

    public int resourceCost;


    public Unit() {
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
        Unit flyingMachine = Unit.builder()
                .name("FlyingMachine")
                .goldCost(90)
                .lumberCost(30)
                .trainingTime(13)
                .icon("footman")
                .resourceCost(1)
                .build();
        Unit mortarTeam = Unit.builder()
                .name("MortarTeam")
                .goldCost(180)
                .lumberCost(70)
                .trainingTime(40)
                .icon("footman")
                .resourceCost(3)
                .build();

        Unit siegeEngine = Unit.builder()
                .name("SiegeEngine")
                .goldCost(195)
                .lumberCost(60)
                .trainingTime(55)
                .icon("footman")
                .resourceCost(3)
                .build();
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

    }
}



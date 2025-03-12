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




    }
}



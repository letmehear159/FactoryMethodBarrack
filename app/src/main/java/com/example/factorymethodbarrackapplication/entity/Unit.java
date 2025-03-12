package com.example.factorymethodbarrackapplication.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Unit implements Serializable {
    private String name;

    private float trainingTime;

    private int goldCost;

    private int lumberCost;

    public String icon;

    public int resourceCost;

}



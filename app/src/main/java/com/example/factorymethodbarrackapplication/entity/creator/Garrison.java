package com.example.factorymethodbarrackapplication.entity.creator;

import com.example.factorymethodbarrackapplication.entity.product.Squad;

public abstract class Garrison {
    public abstract Squad createSquad();

    public void trainUnit(String unitType) {

    }
}
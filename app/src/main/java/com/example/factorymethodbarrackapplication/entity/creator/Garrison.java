package com.example.factorymethodbarrackapplication.entity.creator;

import com.example.factorymethodbarrackapplication.entity.Unit;
import com.example.factorymethodbarrackapplication.entity.product.Squad;

import java.util.Map;

public abstract class Garrison {
    public abstract Squad createSquad();

    public void trainUnit(String unitType) {

    }

    public Map<String, Unit> getSquad() {
        var squad = createSquad();
        return squad.getSquad();
    }
}
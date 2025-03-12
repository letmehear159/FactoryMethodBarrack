package com.example.factorymethodbarrackapplication.entity.product;
import com.example.factorymethodbarrackapplication.entity.Unit;

import java.util.HashMap;

public abstract class Squad {
    protected HashMap<String, Unit> units;

    public HashMap<String, Unit> getSquad() {
        return units;
    }
}

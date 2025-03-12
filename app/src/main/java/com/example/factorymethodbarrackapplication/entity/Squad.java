package com.example.factorymethodbarrackapplication.entity;
import java.util.HashMap;

public abstract class Squad {
    protected HashMap<String, Unit> units = new HashMap<>();

    public HashMap<String, Unit> getSquad() {
        return units;
    }
}

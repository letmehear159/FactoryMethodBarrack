package com.example.factorymethodbarrackapplication.entity;
import java.util.HashMap;

public class BarrackSquad extends Squad {
    public BarrackSquad() {
        units.put("footman", new Footman());
        units.put("rifleman", new Rifleman());
        units.put("knight", new Knight());
    }
}

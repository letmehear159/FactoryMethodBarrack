package com.example.factorymethodbarrackapplication.entity;

import com.example.factorymethodbarrackapplication.entity.Squad;
import com.example.factorymethodbarrackapplication.entity.BarrackSquad;

public class Barrack extends Garrison {
    @Override
    public BarrackSquad createSquad() {
        return new BarrackSquad();
    }
}

package com.example.factorymethodbarrackapplication.entity;

import com.example.factorymethodbarrackapplication.entity.Squad;
import com.example.factorymethodbarrackapplication.entity.ArcaneSquad;
public class ArcaneSanctum extends Garrison {
    @Override
    public ArcaneSquad createSquad() {
        return new ArcaneSquad();
    }
}

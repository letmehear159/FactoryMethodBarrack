package com.example.factorymethodbarrackapplication.entity;

import com.example.factorymethodbarrackapplication.entity.Squad;
import com.example.factorymethodbarrackapplication.entity.AviarySquad;
public class GryphonAviary extends Garrison {
    @Override
    public AviarySquad createSquad() {
        return new AviarySquad();
    }
}
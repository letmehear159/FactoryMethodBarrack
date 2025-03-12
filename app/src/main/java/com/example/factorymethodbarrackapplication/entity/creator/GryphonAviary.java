package com.example.factorymethodbarrackapplication.entity.creator;

import com.example.factorymethodbarrackapplication.entity.product.AviarySquad;
public class GryphonAviary extends Garrison {
    @Override
    public AviarySquad createSquad() {
        return new AviarySquad();
    }
}
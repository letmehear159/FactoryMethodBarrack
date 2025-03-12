package com.example.factorymethodbarrackapplication.entity.creator;

import com.example.factorymethodbarrackapplication.entity.product.ArcaneSquad;
public class ArcaneSanctum extends Garrison {
    @Override
    public ArcaneSquad createSquad() {
        return new ArcaneSquad();
    }
}

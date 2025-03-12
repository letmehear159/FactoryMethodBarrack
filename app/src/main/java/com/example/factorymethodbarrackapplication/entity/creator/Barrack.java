package com.example.factorymethodbarrackapplication.entity.creator;

import com.example.factorymethodbarrackapplication.entity.product.BarrackSquad;

public class Barrack extends Garrison {
    @Override
    public BarrackSquad createSquad() {
        return new BarrackSquad();
    }
}

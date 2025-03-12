package com.example.factorymethodbarrackapplication.entity;

import com.example.factorymethodbarrackapplication.entity.Squad;
import com.example.factorymethodbarrackapplication.entity.WorkShopSquad;
public class WorkShop extends Garrison {
    @Override
    public WorkShopSquad createSquad() {
        return new WorkshopSquad();
    }
}



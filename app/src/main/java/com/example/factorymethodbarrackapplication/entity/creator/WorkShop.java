package com.example.factorymethodbarrackapplication.entity.creator;

import com.example.factorymethodbarrackapplication.entity.product.WorkShopSquad;
public class WorkShop extends Garrison {
    @Override
    public WorkShopSquad createSquad() {
        return new WorkshopSquad();
    }
}



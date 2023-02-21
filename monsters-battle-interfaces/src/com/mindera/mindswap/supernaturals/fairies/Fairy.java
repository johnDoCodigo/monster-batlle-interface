package com.mindera.mindswap.supernaturals.fairies;

import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.SupernaturalType;

public class Fairy extends Supernatural {

    public Fairy(int hitPower) {
        super(hitPower, SupernaturalType.FAIRY);
    }


    @Override
    protected void setHealth(int health) {
        //not inteded to die
        super.setHealth(100);
        return;
    }
}

package com.mindera.mindswap.supernaturals.fairies.little_fairie;

import com.mindera.mindswap.supernaturals.fairies.Fairy;

public class Main extends Fairy{
    public Main(int hitPower) {
        super(hitPower);
    }

    public static void main(String[] args) {
        Fairy f = new Fairy(23);

        Main m = new Main(23);
        m.setHealth(0);
        f.attack();
        Exception e = new NullPointerException();
        Error w = new Error();
    }
}

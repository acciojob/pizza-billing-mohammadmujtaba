package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here

        int frq[] = getFrqCheezeToppingsPaper();

        frq[0]++;
        frq[1]++;
    }
}

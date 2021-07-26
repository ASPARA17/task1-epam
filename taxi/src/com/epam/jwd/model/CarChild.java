package com.epam.jwd.model;

import com.epam.jwd.view.Output;

public class CarChild extends Car {
    int priceBabyChair;

    public CarChild(String name, int price, int fuel, int maxSpeed, int priceBabyChair) {
        super(name, price, fuel, maxSpeed);
        this.priceBabyChair = priceBabyChair;
    }

    public int getPriceBabyChair() {
        return priceBabyChair;
    }

    public void setPriceBabyChair(int priceBabyChair) {
        this.priceBabyChair = priceBabyChair;
    }

    public void speedLimit() {
        Output.output("Speed limit up to 70!");
    }

    @Override
    public String toString() {
        return super.toString() + " CarChild{" + "priceBabyChair=" + priceBabyChair + '}';
    }
}

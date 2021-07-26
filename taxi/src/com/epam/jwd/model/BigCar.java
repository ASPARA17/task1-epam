package com.epam.jwd.model;

import com.epam.jwd.view.Output;

public class BigCar extends CarChild{
    int capacity;

    public BigCar(String name, int price, int fuel, int maxSpeed, int priceBabyChair, int capacity) {
        super(name, price, fuel, maxSpeed, priceBabyChair);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void speedLimit() {
        if(getPriceBabyChair() != 0) {
            super.speedLimit();
        } else {
            Output.output("No speed limit!");
        }
    }

    @Override
    public String toString() {
        return super.toString() +  " BigCar{" + "capacity=" + capacity + '}';
    }
}

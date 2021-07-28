package com.epam.jwd.model;

import com.epam.jwd.view.Output;

import java.util.Objects;

public class CarChild extends Car {
    private int priceBabyChair;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CarChild carChild = (CarChild) o;
        return priceBabyChair == carChild.priceBabyChair;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), priceBabyChair);
    }
}

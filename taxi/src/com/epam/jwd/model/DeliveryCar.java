package com.epam.jwd.model;

import com.epam.jwd.view.Output;

import java.util.Objects;


public class DeliveryCar extends CarChild{
    private int priceDelivery;

    public DeliveryCar(String name, int price, int fuel, int maxSpeed, int priceBabyChair,
                       int priceDelivery) {
        super(name, price, fuel, maxSpeed, priceBabyChair);
        this.priceDelivery = priceDelivery;
    }

    public int getPriceDelivery() {
        return priceDelivery;
    }

    public void setPriceDelivery(int priceDelivery) {
        this.priceDelivery = priceDelivery;
    }

    public void delivery() {
        Output.output("Delivery products");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DeliveryCar that = (DeliveryCar) o;
        return priceDelivery == that.priceDelivery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), priceDelivery);
    }

    @Override
    public String toString() {
        return super.toString() + "DeliveryCar{" + "priceDelivery=" + priceDelivery + '}';
    }
}

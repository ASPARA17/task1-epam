package com.epam.jwd.model;

import com.epam.jwd.view.Output;

import java.util.Objects;

public class Car implements Comparable <Car>{
    private String name;
    private int price;
    private Integer fuel;
    private int maxSpeed;

    public Car(String name, int price, int fuel, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        Output.output("Gas!!!");
    }

    public void brake() {
        Output.output("Brake!!!");
    }


    @Override
    public int compareTo(Car o) {
        return this.fuel.compareTo(o.fuel);
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", price=" + price + ", fuel=" + fuel + ", " +
                "maxSpeed=" + maxSpeed + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && maxSpeed == car.maxSpeed && name.equals(car.name) && fuel.equals(car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, fuel, maxSpeed);
    }
}

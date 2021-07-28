package com.epam.jwd.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Manager {

    public void add(ArrayList<DeliveryCar> carList, DeliveryCar car,DeliveryCar car1, DeliveryCar car2){
        carList.add(car);
        carList.add(car1);
        carList.add(car2);
    }

    public void addCar(ArrayList<DeliveryCar> carList, String name, int price, int fuel, int maxSpeed,
                       int priceBabyChair, int priceDelivery) {
        DeliveryCar car = new DeliveryCar(name, price, fuel, maxSpeed, priceBabyChair,
                priceDelivery);
        carList.add(car);
    }

    public int calcPriceCarPark(ArrayList<DeliveryCar> carList) {
        int priceCarPark = 0;
        for (DeliveryCar car : carList) {
            priceCarPark += car.getPrice();
        }
        return priceCarPark;
    }

    public void sortCarByFuel(ArrayList<DeliveryCar> carList) {
        Collections.sort(carList);
    }

    public  HashSet<DeliveryCar> searchCarBySpeed(ArrayList<DeliveryCar> carList, int startSpeed,
                                              int endSpeed) {
        HashSet<DeliveryCar> carsBySpeed = new HashSet<DeliveryCar>();
        for (DeliveryCar car : carList) {
            for (int i = startSpeed; i <= endSpeed; i++) {
                if (car.getMaxSpeed() >= startSpeed && car.getMaxSpeed() <= endSpeed) {
                    carsBySpeed.add(car);
                }
            }
        }
        return carsBySpeed;
    }


}

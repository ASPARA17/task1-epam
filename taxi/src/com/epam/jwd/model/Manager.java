package com.epam.jwd.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Manager {

    public void add(ArrayList<BigCar> carList, BigCar car,BigCar car1, BigCar car2){
        carList.add(car);
        carList.add(car1);
        carList.add(car2);
    }

    public void addCar(ArrayList<BigCar> carList, String name, int price, int fuel, int maxSpeed,
                       int priceBabyChair,
                             int capacity) {
        BigCar car = new BigCar(name, price, fuel, maxSpeed, priceBabyChair, capacity);
        carList.add(car);
    }

    public int calcPriceCarPark(ArrayList<BigCar> carList) {
        int priceCarPark = 0;
        for (BigCar car : carList) {
            priceCarPark += car.getPrice();
        }
        return priceCarPark;
    }

    public void sortCarByFuel(ArrayList<BigCar> carList) {
        Collections.sort(carList);
    }

    public  HashSet<BigCar> searchCarBySpeed(ArrayList<BigCar> carList, int startSpeed,
                                              int endSpeed) {
        HashSet<BigCar> carsBySpeed = new HashSet<BigCar>();
        for (BigCar car : carList) {
            for (int i = startSpeed; i <= endSpeed; i++) {
                if (car.getMaxSpeed() >= startSpeed && car.getMaxSpeed() <= endSpeed) {
                    carsBySpeed.add(car);
                }
            }
        }
        return carsBySpeed;
    }


}

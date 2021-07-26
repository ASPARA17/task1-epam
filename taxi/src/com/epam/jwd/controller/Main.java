package com.epam.jwd.controller;

import com.epam.jwd.model.BigCar;
import com.epam.jwd.model.Manager;
import com.epam.jwd.model.Validator;

import java.util.ArrayList;
import java.util.HashSet;

import static com.epam.jwd.view.Input.inputInt;
import static com.epam.jwd.view.Input.inputString;
import static com.epam.jwd.view.Output.output;
import static com.epam.jwd.view.Output.printCollection;

public class Main {
    public static void main(String[] args) {
        int choice;
        Manager manager = new Manager();
        ArrayList<BigCar> carList = new ArrayList<BigCar>();

        BigCar car = new BigCar("BMW", 5000, 7, 150, 0, 5);
        BigCar car1 = new BigCar("Toyota", 7000, 8, 170, 0, 5);
        BigCar car2 = new BigCar("Opel", 3500, 5, 110, 100, 7);

        while (true) {
            output("Select: ");
            output("1.Calculate the cost of the car park");
            output("2.Sorting of car park by fuel consumption");
            output("3.Search for a car at a given speed");
            output("4.Add car");
            output("5.All cars");

            choice = inputInt("");
            switch (choice) {
                case 1 -> {

                    int priceCarPark = manager.calcPriceCarPark(carList);
                    output("The Cost of the car park: " + priceCarPark);
                }
                case 2 -> {
                    manager.sortCarByFuel(carList);
                    output("Sort of car park by fuel consumption: ");
                    printCollection(carList);
                }
                case 3 -> {
                    int startSpeed = inputInt("Enter start speed:");
                    int endSpeed = inputInt("Enter end speed:");
                    HashSet<BigCar> carsBySpeed = manager.searchCarBySpeed(carList, startSpeed,
                            endSpeed);
                    printCollection(carsBySpeed);
                }
                case 4 -> {
                    String name = inputString("Enter car name: ");
                    int price = Validator.notEqualZero(inputInt("Enter car price: "));
                    int fuel = Validator.notEqualZero(inputInt("Enter fuel consumption: "));
                    int maxSpeed = Validator.notEqualZero(inputInt("Enter max speed: "));
                    int priceBabyChair = inputInt("Enter price baby chair(if there): ");
                    int capacity = Validator.notEqualZero(inputInt("Enter car capacity: "));

                    manager.addCar(carList, name, price, fuel, maxSpeed, priceBabyChair, capacity);
                }
                case 5 -> {
                    manager.add(carList, car, car1, car2);
                    printCollection(carList);
                }
                default -> output("Invalid choice! Repeat");
            }
        }
    }
}

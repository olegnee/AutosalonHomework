package com.company;

import java.util.concurrent.Callable;

public class Client implements Runnable {

    private String name;
    private int amountOfWantedCars;
    private Autosalon salon;
    private int howOftenClientBuyTheCar;

    public Client(String name, int amountOfWantedCars, Autosalon salon, int howOftenClientBuyTheCar) {
        this.name = name;
        this.amountOfWantedCars = amountOfWantedCars;
        this.salon = salon;
        this.howOftenClientBuyTheCar = howOftenClientBuyTheCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfWantedCars() {
        return amountOfWantedCars;
    }

    public void setAmountOfWantedCars(int amountOfWantedCars) {
        this.amountOfWantedCars = amountOfWantedCars;
    }

    public int getHowOftenClientBuyTheCar() {
        return howOftenClientBuyTheCar;
    }

    public void setHowOftenClientBuyTheCar(int howOftenClientBuyTheCar) {
        this.howOftenClientBuyTheCar = howOftenClientBuyTheCar;
    }

    @Override
    public void run() {
        salon.sellCar(this);
    }
}

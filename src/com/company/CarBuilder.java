package com.company;

import java.util.*;

public class CarBuilder {
    private int timeToBuild;
    private int amountOfCars;

    public void setAmountOfCars(int amountOfCars) {
        this.amountOfCars = amountOfCars;
    }

    private Autosalon salon;

    public CarBuilder (Autosalon autosalon) {
        this.salon = autosalon;
    }
    public CarBuilder () {

    }

    public void setTimeToBuild(int timeToBuild) {
        this.timeToBuild = timeToBuild;
    }

    synchronized void createNewCar() {
        try {
            System.out.println("Производитель божественных машин: Начато производство Ауди Ройс А7 производства Мерседес.");
            int i = 0;
            while ( !(i == amountOfCars)) {
                Thread.sleep(timeToBuild);
                salon.getCars().add(new Car());
                System.out.println("Производитель божественных машин: Производство Ауди Ройс А7 производства Мерседес завершено.");
                notifyAll();
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

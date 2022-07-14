package com.company;

import java.util.ArrayList;
import java.util.List;

public class Autosalon {

    List<Car> cars = new ArrayList<>();
    CarBuilder builder = new CarBuilder(this);

//
//    public Car sellCar () {
//        return client.sellCar();
//    }
    public void createCar() {
        builder.setTimeToBuild(2500);
        builder.setAmountOfCars(15);
        builder.createNewCar();
    }

    List<Car> getCars () {
        return cars;
    }

    synchronized Car sellCar(Client client) {
        try {
            int i = 0;
            while (!(i == client.getAmountOfWantedCars())) {
                System.out.println(client.getName() + "вошел в магазин.");
                while (getCars().size() == 0) {
                    System.out.println("Производитель божественных машин: Для обычных потоков, автомобилей нет!");
                    wait();
                }
                Thread.sleep(client.getHowOftenClientBuyTheCar());
                System.out.println("Производитель божественных машин: Ауди Ройс А7 производства Мерседес был продан возжелавшему: " + Thread.currentThread().getName());
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return getCars().remove(0);
    }
}

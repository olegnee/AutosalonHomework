package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Autosalon salon = new Autosalon();
	Client Vova = new Client("Володька", 4, salon, 1200);
	Client Sanek = new Client("Санек", 2, salon, 3000);
	Client Fedor = new Client("Федот", 5, salon, 1000);
	Client Snejana = new Client("Снежана", 4, salon, 1500);
    Thread vovasThread = new Thread(null, Vova, Vova.getName());
    Thread fedorThread = new Thread(null, Fedor, Fedor.getName());
    Thread sanekThread = new Thread(null, Sanek, Sanek.getName());
    Thread snejanaThread = new Thread(null, Snejana, Snejana.getName());
        synchronized (salon) {
            salon.createCar();
        }
    vovasThread.start();
    sanekThread.start();
    fedorThread.start();
    snejanaThread.start();


    }
}

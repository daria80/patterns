package Creational.AbstractFactory.Transport.Impl.Car;

import Creational.AbstractFactory.Transport.Interfaces.Car;

public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");

    }
}

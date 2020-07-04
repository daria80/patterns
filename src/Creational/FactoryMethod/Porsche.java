package Creational.FactoryMethod;

public class Porsche implements Car {

    @Override
    public void drive() {

        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {

        System.out.println("Stopped at 1 sec");
    }

    @Override
    public void turn_around() {

        System.out.println("Turn around 20 times");
    }

}

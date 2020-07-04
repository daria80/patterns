package Creational.FactoryMethod;

public class Geep implements Car {

    @Override
    public void drive() {

        System.out.println("Drive speed 50 km/h");
    }

    @Override
    public void stop() {

        System.out.println("Stopped at 5 sec");
    }

    @Override
    public void turn_around() {

        System.out.println("Turn around 10 times");
    }

}

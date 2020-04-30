package Creational.AbstractFactory.Transport;

import Creational.AbstractFactory.Transport.Factories.RussianFactory;
import Creational.AbstractFactory.Transport.Factories.USAFactory;
import Creational.AbstractFactory.Transport.Factory.Interfaces.TransportFactory;
import Creational.AbstractFactory.Transport.Interfaces.Aircraft;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {

//        TransportFactory russianFactory = new RussianFactory();
//        Aircraft aircraft = russianFactory.createAircraft();
//        aircraft.flight();

        if (true) {
            factory = new RussianFactory();
        }
        else {
            factory = new USAFactory();
        }

        factory.createAircraft();
        factory.createCar();


    }
}

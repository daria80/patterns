package Creational.AbstractFactory.Transport.Factories;

import Creational.AbstractFactory.Transport.Factory.Interfaces.TransportFactory;
import Creational.AbstractFactory.Transport.Impl.Car.Porsche;
import Creational.AbstractFactory.Transport.Impl2.Aircraft.Boeing747;
import Creational.AbstractFactory.Transport.Interfaces.Aircraft;
import Creational.AbstractFactory.Transport.Interfaces.Car;


public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}

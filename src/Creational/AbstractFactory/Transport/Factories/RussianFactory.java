package Creational.AbstractFactory.Transport.Factories;

import Creational.AbstractFactory.Transport.Factory.Interfaces.TransportFactory;
import Creational.AbstractFactory.Transport.Impl.Car.Niva;
import Creational.AbstractFactory.Transport.Impl2.Aircraft.TU134;
import Creational.AbstractFactory.Transport.Interfaces.Aircraft;
import Creational.AbstractFactory.Transport.Interfaces.Car;

//российские транспортные средства
public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}

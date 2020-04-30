package Creational.AbstractFactory.Transport.Factory.Interfaces;

import Creational.AbstractFactory.Transport.Interfaces.Aircraft;
import Creational.AbstractFactory.Transport.Interfaces.Car;

//фабрика по созданию транспортных средств
public interface TransportFactory {

    //что фабрика будет производить

    Car createCar();//автомобили

    Aircraft createAircraft();//самолеты

}

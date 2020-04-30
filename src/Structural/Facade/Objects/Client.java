package Structural.Facade.Objects;

import Structural.Facade.Facade.CarFacade;
import Structural.Facade.Parts.Door;
import Structural.Facade.Parts.Wheel;
import Structural.Facade.Parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        //вызов без фасада:
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        //вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();

    }
}

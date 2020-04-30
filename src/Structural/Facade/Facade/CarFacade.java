package Structural.Facade.Facade;

import Structural.Facade.Parts.Door;
import Structural.Facade.Parts.Wheel;
import Structural.Facade.Parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go() {
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}

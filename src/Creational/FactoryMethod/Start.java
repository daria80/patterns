package Creational.FactoryMethod;

public class Start {
    public static void main(String[] args) {

//        Car geep = new Geep();
//        geep.drive();
//
//        Car porCar = new Porsche();
//        porCar.drive();

        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.GAZON);


    }
}

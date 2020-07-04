package Creational.FactoryMethod;

//фабрика по созданию автомобиля
public class CarSelector {

    //фабричный метод, который создаёт нужный автомобиль
    public Car getCar(RoadType roadType) {

        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }
        return car;


////        Car car = null;
//        switch (roadType) {
//            case CITY:
////                car = new Porsche();
//                return new Porsche();
////                break;
//            case OFF_ROAD:
//                car = new Geep();
//                break;
//            case GAZON:
//                car = new NewGeep();
//                break;
//        }
//        return car;

    }
}

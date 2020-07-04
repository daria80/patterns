package Creational.Singleton;

public class Start {

    public static void main(String[] args) {

        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().stop();

        TestSingleton1.getInstance().print();
        TestSingleton1.getInstance().stop();

        TestSingleton.instance.print();
        TestSingleton.instance.stop();

    }
}

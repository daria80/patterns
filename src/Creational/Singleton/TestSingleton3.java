package Creational.Singleton;

public class TestSingleton3 {

    private static TestSingleton3 instance;

    public static TestSingleton3 getInstance() {
        if (instance == null) {
            instance = new TestSingleton3();
        }
        return instance;
    }

    private  TestSingleton3() {
    }

    public void print() {
        System.out.println(this );
    }

    public void stop() {
        System.out.println("stop3 ");
    }
}

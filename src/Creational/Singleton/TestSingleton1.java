package Creational.Singleton;

public class TestSingleton1 {

    public static TestSingleton1 instance;

    public static synchronized TestSingleton1 getInstance() {
        if (instance == null) {
            instance = new TestSingleton1();
        }
        return instance;
    }
    private  TestSingleton1() {
    }

    public void print() {
        System.out.println(this );
    }

    public void stop() {
        System.out.println("stop1");
    }
}

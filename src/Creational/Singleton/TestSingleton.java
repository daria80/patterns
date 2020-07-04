package Creational.Singleton;

public class TestSingleton {

    public static TestSingleton instance;

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    private  TestSingleton() {
    }

    public void print() {
        System.out.println(this );
    }

    public void stop() {
        System.out.println("stop");
    }
}

//Spring
//Чтобы ускорить работу приложения ( Если каждый раз обращаться к объекту и вызывать его инициализацию - это долго )
//Важно, что один раз инициализировали - больше не трогаем
//Создаем единожны. единожды инициализируем и  используем много раз этот экземпляр

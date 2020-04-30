package Behavioral.Observer;

public class Subscriber2 implements PublisherActionListener {
    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}

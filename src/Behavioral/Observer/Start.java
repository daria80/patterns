package Behavioral.Observer;

public class Start {
    public static void main(String[] args) {
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        Publisher publisher = new Publisher();

        publisher.addListener(subscriber1);
        publisher.addListener(subscriber2);

        publisher.createNewMessage("Message!");
    }
}

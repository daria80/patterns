package Structural.Decorator.Objects;

public class Button implements Component {
    @Override
    public void draw() {
        System.out.println("draw button");
    }
}

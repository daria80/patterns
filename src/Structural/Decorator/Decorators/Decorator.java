package Structural.Decorator.Decorators;

import Structural.Decorator.Objects.Component;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator (Component component) {
        this.component = component;
    }

    public abstract void afterDraw();//новый метод, который будет вызываться
    // после отрисовки готового компонента

    @Override
    public void draw() {
        component.draw();//вызываем метод draw() у самого компонента
        afterDraw();
    }
}

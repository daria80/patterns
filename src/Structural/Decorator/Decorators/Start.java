package Structural.Decorator.Decorators;

import Structural.Decorator.Objects.Button;
import Structural.Decorator.Objects.Component;
import Structural.Decorator.Objects.TextView;
import Structural.Decorator.Objects.Window;

public class Start {

    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {

        boolean showBorder = true;

        if (!showBorder) {
            window = new Window();
            textView = new TextView();
            button = new Button();
        }
        else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        window.draw();
        textView.draw();
        button.draw();




//        Component window = new Window();
//        window.draw();
//
//        Component windowWithBorder = new BorderDecorator(new Window());
//        windowWithBorder.draw();
//
//        Component windowWithBorder2 = new ColorDecorator(new BorderDecorator(new Window()));
//        windowWithBorder2.draw();
//
//        Component textView = new ColorDecorator(new TextView());
//        textView.draw();


    }
}

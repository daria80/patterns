package Creational.AbstractFactory.Transport.Impl2.Aircraft;

import Creational.AbstractFactory.Transport.Interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU134 fly!");
    }
}

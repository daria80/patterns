package Structural.Adapter.Objects;

import Structural.Adapter.Adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

//клиент, который хочет уметь печатать сразу много текста
//работает с адаптером, а не с принтером напрямую
public class Client {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }

}

package tasks;

public  class Batonchik extends Sweets implements Box {

    @Override
    public void weight() {
        System.out.println("Вес батончика 71 грамм");
    }

    @Override
    public void price() {
        System.out.println("Цена батончика 31 рубль");
    }

    @Override
    public void add (){

    }

    @Override
    public void delete(){

    }
}


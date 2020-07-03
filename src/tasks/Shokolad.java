package tasks;

public  class Shokolad extends Sweets implements Box {

    @Override
    public void weight() {
        System.out.println("Вес шоколада 100 грамм");
    }

    @Override
    public void price() {
        System.out.println("Цена шоколада 39 рублей");
    }

    @Override
    public void add (){

    }

    @Override
    public void delete(){

    }
}

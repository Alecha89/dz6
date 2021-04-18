package com.company;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int cost;

    public Car(int wheelCount, int doorsCount, int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }
    //реализация метода printInfo
    @Override
    public void printInfo() {
       System.out.println("Машина - Количество дверей:"+doorsCount+" -Количество колес:"+wheelCount+" Цена:"+this.getCost());
    }
    //реализация метода getCost интерфейса Castable
    @Override
    public int getCost() {
    return cost;
    }

}

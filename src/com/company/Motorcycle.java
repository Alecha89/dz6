package com.company;

public class Motorcycle extends Vehicle {
    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }
        //реализация метода printInfo
        @Override
        public void printInfo() {
            System.out.println("Мотоцикл - Количество колес:"+wheelCount+" -Максимальная скорость:"+maxSpeed);
        }

}

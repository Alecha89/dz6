package com.company;

public abstract class Vehicle {
    // поля класса
    protected int wheelCount;

    // конструктор
    public Vehicle (int wheelCount) {
        this.wheelCount = wheelCount;
    }

    // метод printInfo
    protected abstract void printInfo();

}

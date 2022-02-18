package ru.samsung.itschool.mdev;

public class ECar extends Car {
    protected int batteryCapacity;

    public ECar(String name, int power, int batteryCapacity) {
        super(name, power);
        this.batteryCapacity = batteryCapacity;

    }

    @Override
    void doMove() {
        System.out.println("Ecar moving...");
    }

}

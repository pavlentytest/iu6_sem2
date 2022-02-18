package ru.samsung.itschool.mdev;

public class Car {

    protected String name;
    protected int power;

    public Car() {

    }

    //abstract void doSmth();

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    void doMove() {
        System.out.println("Car moving...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}

package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public int a;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(0,3);

        int i=0;
        for(i=0;i<10;i++) {

        }
        String[] str = new String[]{"35235","345345","345345"};
        for(String s: str) {
            System.out.println(s);
        }
        if(11==12) {

        } else if(1==1) {

        } else {

        }

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str2 = scanner.nextLine();
        String word = scanner.next();

        String a_ = Integer.toString(a);
        int str2_ = Integer.parseInt(str2); // "123"

	    // инкапсуляция (incapsulation)
        // полиморфизм (polymorphism)
        // наследование (inheritance)
        // абстракция (abstraction)

        Car car = new Car();
        car.setName("BMW");
        car.setPower(100);

        Car opel = new Car("Opel",45);
        System.out.println(opel);

        ECar tesla = new ECar("Tesla",67,89);

        ECar car2 = new ECar("TTT",56,2);


        Movable move = new Movable() {
            @Override
            public void doMove() {

            }
        };


        move.doMove();


    }
}

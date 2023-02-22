package Review8;

import Review7.Car;
import Review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("Bmw","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();//comes from BMW which is subclass

        Car car=new Car("SomeCar","SomeModel");
        car.start();
        car.drive(90);

        Car tesla=new Tesla("Tesla","s",2022,350,"electric",true);
        tesla.start();//overrided method from tesla class is excuted
        tesla.drive(75);//comes from parent class
        //comes from tesla class

        //Runtime polymorphism achieved through method overriding
        //casting :widening and narrowing - used with primitives
        //         upcasting and downcasting - use with non primitives

        Car bmw1=new Bmw("Bmw","X77");//upcasting
        bmw1.start();
        bmw1.drive(100);
        bmw1.drive("Miami",120);

    }
}

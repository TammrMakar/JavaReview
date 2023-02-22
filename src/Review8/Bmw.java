package Review8;

import Review7.Car;

public class Bmw extends Car {

    Bmw(String make,String model){
        super(make, model);
    }

    @Override
   public void start() {
        System.out.println(make+" starts with push start button");
    }
   public String drive(String typeOfDrive){
       System.out.println(make+" drives "+typeOfDrive);
       return typeOfDrive;

    }
    void brake(){
        System.out.println(make+" brakes");
    }
}

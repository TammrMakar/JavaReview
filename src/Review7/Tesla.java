package Review7;

//Tesla is a subclass of a Car class
//car class is superclass of tesla

public class Tesla extends Car{

    String type;
    boolean autoPilot;

    Tesla(String make,String model,int year ,int horsePower,String type,Boolean autoPilot){
        super(make,model,year,horsePower);
        this.type=type;
        this.autoPilot=autoPilot;

    }
protected void haveAutopilot(){
    System.out.println(make+" have auto pilot "+autoPilot);

    }

    public void start(){


    }
    //overriding - is when we have same method name in 2 DIFFERENT class(parent - child)
    //in Overriding - inheritance is a must
    //in overriding methods signature should be SAME
}


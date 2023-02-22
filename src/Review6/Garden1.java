package Review6;

public class Garden1 {


    void hello(){
        String name="adem";//local variable
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {


       //Static String str;//cannot use static for local variable
        //System.out.println(name);//error since local variable is not visible

   //variable i = is a local to its block of code loop
        for (int i = 0; i <=3 ; i++) {
            System.out.println(i);
        }
        //System.out.println(i);error since i is not visible outside of loop{}
    }
    }



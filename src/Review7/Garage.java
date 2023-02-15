package Review7;

public class Garage {
    public static void main(String[] args) {

        Tesla tesla=new Tesla("Tesla","s",2023,340,"electric",true);

        //from super class
        tesla.start();
        tesla.drive(100);

         //from tesla class - subclass
        tesla.haveAutopilot();//from
        tesla.drive("Miami");




    }
}

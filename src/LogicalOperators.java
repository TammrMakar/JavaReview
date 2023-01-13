public class LogicalOperators
{
    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginButtonClikable=false;

        if(loginButtonDisplayed && loginButtonClikable){
            System.out.println("test case is passed");
        }else{
            System.out.println("Test case failed");
        }
        System.out.println("--------------------------------Logical or-----------------------");
        boolean dashboard=false;
        String message="welcome admin";

        if(dashboard|| message.equals("welcome admin")) {
            System.out.println("User is succesfully logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("--------------------------------Logical not-----------------------");

      boolean b=true;

        System.out.println(! true);

        boolean agreecheckboxselected=false;
        if(!agreecheckboxselected){
            System.out.println("I am clicking on checkbox");
        }else {
            System.out.println("I am clicking on submit button");
        }
    }
}

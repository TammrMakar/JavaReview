package Review3;

public class NestedIf {
    public static void main(String[] args) {

        boolean vaccine = true;
        int dose = 0;

        if (vaccine) {
            System.out.println("How many doses you have");
            if (dose == 1) {
                System.out.println("You need a second shot");
            } else {
                System.out.println("You are fully vacinated");
            }
        } else {
            System.out.println("I do not have to vacinated");
        }
    }
}




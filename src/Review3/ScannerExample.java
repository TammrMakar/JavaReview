package Review3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {


        Scanner Keyboard= new Scanner(System.in);


        System.out.println("That's correct");
        boolean correct= Keyboard.hasNextBoolean();

        System.out.println("Whats your age");
        int age=Keyboard.nextInt();

        System.out.println("Are you okay");
        String okay=Keyboard.nextLine();
    }
}

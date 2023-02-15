package Review2;

import java.util.Locale;
import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite browser");
        String browser=scan.nextLine();

        switch(browser.toLowerCase()){

            case "Chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "Microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
                default:
                System.out.println("Browser is unknown - no execution");
        }
    }
}

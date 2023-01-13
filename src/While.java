import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i=1;
        while(i<=4){
            System.out.println("Hello");
            i++;

        }
      Scanner scan=new Scanner(System.in);
        System.out.println("Are you Tired");
        boolean tired= scan.hasNext();
        while(!tired){
            System.out.println("this is great");
            System.out.println("Lets study java");
            System.out.println("Are you tired");
            tired=scan.nextBoolean();
            System.out.println();
        }
    }

}



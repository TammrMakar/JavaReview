package Review4;


import java.util.Scanner;

public class WhileAndDoWhileLoops {
    public static void main(String[] args) {
        //while loop
        int a=1;
        while(a<=3){
            System.out.println("I am while loop");
            a++;
        }
        //when we do not know how many times we need to repeat a block of code
        //do while loop
        int b=1;
        do{
            System.out.println("do while");
            b++;
    }while(b>=3);

        //ask students if they understand loops?
        //if they don't --> tell them to practice more on loops
       // if they understand -->you good move to array concept
        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in java");
       answer = scan.nextLine();
        } while(!answer.equalsIgnoreCase("yes"));
        System.out.println("Great jobs,lets learn arrays now");
}}


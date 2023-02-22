package Review4;


public class NestedLoops {
    public static void main(String[] args) {

        //nested Loop- loop inside loop
        //inner loop ALWAYS depends on outer loop

        for (int i = 1; i <=3; i++) {//outer loop
            System.out.println(i);
            for (int j = 1; j <=4; j++) {//inner loop
                System.out.println(j);
            }
            }
        System.out.println("-------------------");
       //outer loop controls number of compelete internation/executions for  inner loop

        for (int i = 1; i <5 ; i++) {  //outer
            System.out.println("Hello");
            for (int j = 1; j <=2 ; j++) {//inner
                System.out.println("Bye");
            }
        }
        }
        }


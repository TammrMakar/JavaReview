package Review4;


public class MoreForLoops {
    public static void main(String[] args) {

        for (int i = 0; i <=3; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("-------------card-----------");

        for (int i = 0; i <=9 ; i++) {  //outer loop
            for (int j = 1; j <=9 ; j++) { //inner loop
                for (int k = 0; k <=9 ; k++) {
                    for (int l = 0; l <= 9; l++) {

                        System.out.println(i+ " " +j+ " " +k+ " " +l);
                    }
                }
                //homework create a digital (clock) loop
                // it should start printing 00:00and end 23:59
            }
        }
        System.out.println("-------------card-----------");



        }

        }



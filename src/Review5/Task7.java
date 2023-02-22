package Review5;

public class Task7 {
    public static void main(String[] args) {


        // 1.number>1
        //numbers should be  divisble only byt itself and 1 only
        //2(1,2) , 3(1,3)  4(1,2,4)  5(1,5)

        int given = 4;
        boolean isPrime = true;

        if (given > 1) {

            for (int i = 2; i < given; i++) {
                if (given % 2 == 0) {
                    isPrime=false;
                    break;

                }
            }

        }else {
            isPrime=false;
        }
        System.out.println("Given number "+given+" is prime? "+isPrime);
    }}








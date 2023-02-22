package Review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][] array={{1,2,3},{11,12,13},{20,21,22},{100,101}};

        //getting all values from 2d arrays using regular for loop

        for (int row = 0; row < array.length; row++) {//outer iterates over rows

            for (int col = 0; col < array[row].length; col++) {// iterates over column

                //I want to print values only from odd rows
                if (row%2!=0){
                System.out.println(array[row][col]);
            }
        }
            System.out.println();
        }
        System.out.println("--------------------");










        //getting all values from 2d arrays
        for (int[]arr:array) { //iterates over arrays

            for (int num : arr) {//iterates over each element
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);


        int numberOfElementsIn1Array=array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numberOfElementsIn4Array=array[3].length;
        System.out.println(numberOfElementsIn4Array);

        //access 21
        System.out.println(array[2][1]);//21
    }
}

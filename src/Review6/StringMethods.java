package Review6;

public class StringMethods {
    public static void main(String[] args) {


        String str="Hello";
        System.out.println(str.length());//5
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1));//e

         String newString= str.concat(" Friends");
        System.out.println(newString);//Hello friends

        System.out.println(str);//Hello
        str=str.toLowerCase();

        System.out.println(str);//hello


        //check if length of the String is more than 0
         boolean epmty=str.isEmpty();
        System.out.println(epmty);


        String str1=" Review B15   ";
        //remove any leading or trailing white spaces
        String newStr1=str1.trim();

        System.out.println(str1);
        System.out.println(newStr1);

    }
}

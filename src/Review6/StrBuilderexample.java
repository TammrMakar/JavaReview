package Review6;

public class StrBuilderexample {
    public static void main(String[] args) {


        //this class is mutable collection of characters
        StringBuilder sb=new StringBuilder("Hello");

        //this class is happens collection of characters
        sb.reverse();//proves that string builder is mutable

        System.out.println(sb);//olleh
        String str=sb.toString();
        str.toUpperCase();//proves that string is immutable
        System.out.println(str);//olleh

    }
}

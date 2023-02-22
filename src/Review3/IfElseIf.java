package Review3;

public class IfElseIf {
    public static void main(String[] args) {
        int number = 30;
        if (number > 25) {
            System.out.println("great job");
        } else if (number > 20) {
            System.out.println("good job");
        } else if (number > 10) {
            System.out.println("ok job");
        } else if (number > 5) {
            System.out.println("not good job");
        }

        System.out.println("-------------------");
        String browser="opera";
        if(browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("Safari")) {
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on chrome browser");
        }else{
            System.out.println("Browser is not supported");
        }
    }
}

package Review7;

public class OverLoading {

    private void hello(){
        System.out.println("hello");
    }
    private void hello (String name){
        System.out.println("Hello "+name);
    }
    static void bye(){
        System.out.println("bye");
    }
    static void bye(String name){
        System.out.println("Bye "+name);
    }
}

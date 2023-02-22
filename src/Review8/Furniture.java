package Review8;

public class Furniture {

    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }
    public void comfort() {//overriden
        System.out.println("Furniture needs to be comfortable");
    }
        private void use() {
            System.out.println("Furniture is used by humans");
        }
            public static void breaks(){
                System.out.println("Furniture breaks");
            }
    }

class Chair extends Furniture{

    //@override cannot override static method
    public static void breaks(){
        System.out.println("chair can break too");
    }
    //we are not overriding method use here

    private void use(){
        System.out.println("Chair is used by humans to seat");
    }

    @Override
    public void comfort() {//overriding
        System.out.println("Not every chair is comfortable");
    }
    protected void loveSeat(){
        System.out.println("This is the best chair");
    }
}
class Table extends Furniture{

    @Override
    public void comfort() {
        System.out.println("Table cannot be comfortable");
    }
    protected void buildTable(){
        System.out.println("We can easily build a table ");
    }
    void buildTable(String material){
        System.out.println("We can easily build a table "+material);
    }
}
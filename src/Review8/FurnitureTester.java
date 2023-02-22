package Review8;

public class FurnitureTester {
    public static void main(String[] args) {

        Furniture chair=new Chair();
        chair.comfort();
        chair.assemble();//runtime polymorphism
        chair.breaks();// since we are not overriding methods breaks will be  executed

       Furniture table= new Table();
       table.assemble();
       table.comfort();

       Table t=new Table();
       t.assemble();
       t.comfort();
       t.buildTable("Wood");

       Chair.breaks();
        Furniture.breaks();

       //proof that method breaks is not overriden

    }
}

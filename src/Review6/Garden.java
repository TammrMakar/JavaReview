package Review6;

public class Garden {
    public static void main(String[] args) {

      Flower flower1=new Flower();

      //acessing variables of flower class
        System.out.println(flower1.pretty);// correct way accessing static variable
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;// not the right way to access the static variable but it is possible.
      //System.out.println(flower1.pretty);
      System.out.println("Hibiscus are pretty? "+flower1.pretty);
      System.out.println(flower1.price);
        //flower1.size;//error since variables size does not exist in flower class

        //accessihg methods of flowers class
        flower1.grow();
        flower1.smell();
        flower1.grow();

      System.out.println("Creating second object of the flower class");
      Flower flower2= new Flower();
      System.out.println("Roses are pretty? "+flower2.pretty);
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;

      System.out.println(flower2.price);
        flower2.grow();
        flower2.smell();
        flower2.bloom();

      Flower flower3=new Flower();
        flower3.name="Hibiscus";
        flower3.color="red";
        flower3.price=5;

    }
}

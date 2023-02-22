package Review8;

public class InsuranceTest {
    public static void main(String[] args) {
        // can I create an objet of insurance class - no since it abstract

        Insurance carPolicy= new CarPolicy("3342342","John smith",36.0,38);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

       Insurance petPolicy= new petPolicy("psasdad","olena",20,76.0);
      petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());


        Insurance[]insurances={
                new CarPolicy("i23628372","John smith",200,22),
                new CarPolicy("i23628372","John smith",200,22),
                new petPolicy("p239223","Olena l",10,2),
                new petPolicy("p239223","Olena l",10,2),
        };

        insurances [0].calculateCoverage();
    }
}

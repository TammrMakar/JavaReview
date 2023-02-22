package Review8;

public abstract class Insurance {

    // can I have variables inside abstract class -yes
    public static String company="Geico";
    String getPolicyNumber;
    String policyHolder;

    // can I have constructor inside abstract class - yes

    public Insurance(String policyHolder, String getPolicyNumber){
        this.policyHolder=policyHolder;
        this.getPolicyNumber=getPolicyNumber;

    }

    public void getInsurance(){
        System.out.println("We need to get insurance");
    }

    public abstract double calculateCoverage();
}

 class CarPolicy extends Insurance{

    double premium;
    int age;

    CarPolicy(String policyNumber,String policyHolder, double premium,int age){
        super(policyHolder,policyNumber);
        this.premium=premium;
        this.age=age;
    }
   // to provide implementation we need to foloow rules of overriding
   public double calculateCoverage(){
        if (age<20){
            return premium*2;

        }else if (age<40){
            return premium*0.5;

        }else{
            return premium*0.2;
        }

   }
}
class petPolicy extends Insurance{
    int numberOfPets;
    double premium;

    petPolicy(String policyNumber,String policyHolder,int numberOfPets,double premium){
        super(policyHolder,policyHolder);
        this.numberOfPets=numberOfPets;
        this.premium=premium;
    }

    public double calculateCoverage(){
        if (numberOfPets>2){
            return premium*2;

        }else if (numberOfPets>5){
            return premium*3;

        }else{
            return premium*5;
        }

    }
}
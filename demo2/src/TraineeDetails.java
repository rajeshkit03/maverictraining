import java.util.Scanner;

public class TraineeDetails {
    public float emiCalculator(int p,int t,float roi){ // here is the definition
        System.out.println("emicalculator executed");
        float emi = (p * t * roi) / 100; // emi calculation
        //System.out.println("Your EMI is: "+emi);
        return emi;
    }
    public static void main(String[] arg){  //JVM calling the main function
        System.out.println("In Main Method");
        TraineeDetails td=new TraineeDetails();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Priciple Amount");
        int p=s.nextInt();
        System.out.println("Enter the tenure");
        int t=s.nextInt();
        System.out.println("Enter the rate of interest");
        float roi = s.nextFloat();
        float calculateEmi = td.emiCalculator(16000,12,5.6f); // function call
        float finalFixedEmi = calculateEmi + 10 / 100 ;
        System.out.println("EMI after tax: "+  finalFixedEmi);
        System.out.println("End of main function");
    }
}

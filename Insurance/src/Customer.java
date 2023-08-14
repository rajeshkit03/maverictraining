import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sum assured");
        int sa=s.nextInt();
        System.out.println("Enter the no of years");
        int y = s.nextInt();
        System.out.println("Enter the ROI");
        float r = s.nextFloat();
        Lic lic=new Lic();
        float amount = lic.premiumCalculator(sa,y,r);
        System.out.println("premium per month you need pay is: "+amount);
    }
}

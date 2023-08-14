import java.util.Scanner;

public class Calculator {
    public int add(int no1,int no2){
        return no1 + no2;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        Calculator c=new Calculator();
        int total = c.add(a,b);
        System.out.println("Calculated value is: "+total);
    }
}

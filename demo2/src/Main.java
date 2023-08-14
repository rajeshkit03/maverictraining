import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int salary=scan.nextInt();
        boolean isPermanent=scan.nextBoolean();
        float rating = scan.nextFloat();
        System.out.println("Your Name is: "+name);
        System.out.println("your total salary: " + salary);
        System.out.println("is Employee permanent:" + isPermanent);
        System.out.println("your rating is: "+rating);

    }
}
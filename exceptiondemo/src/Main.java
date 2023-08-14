import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome 1!");
        System.out.println("Hello and welcome 2!");
        System.out.println("Hello and welcome 3!");
        Scanner s=new Scanner(System.in);
        try {
            int total = s.nextInt();
            int k = 10/total;
            int[] a={56,34,67};
            System.out.println(a[total]);
           Throwable t;

        }catch(InputMismatchException ex){
            System.out.println("The input should be in integer Should not contain any characters");
        }catch(ArithmeticException ex){
            System.out.println("The divisor value should not be zero");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array index is beyond the size limit kindly check");
        }
        finally {
            System.out.println("it always executes");
        }
//        int[] a={45,46,2};
//        System.out.println(a[7]);
        System.out.println("Hello and welcome 4!");
        System.out.println("Hello and welcome 5!");



    }
}
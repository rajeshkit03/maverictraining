import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1  {
    void display(){
        System.out.println("Hello and welcome 1!");
        System.out.println("Hello and welcome 2!");
        System.out.println("Hello and welcome 3!");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the divisor");

        //ArithmeticException e=new ArithmeticException(); // unchecked exception - propogate
        IOException e=new IOException(); // unchecked exception - not progating


    }
    public static void main(String[] args)  throws IOException{

        Main1 m=new Main1();
        m.display();

    }
}
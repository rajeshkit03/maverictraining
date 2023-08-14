import java.util.Scanner;

public class Customer {
    int customerId;
    String customerName;
    Customer(){
        System.out.println("I am a Customer class constructor");
    }
    void display(){
        System.out.println("Customer ID is: "+customerId);
        System.out.println("Customer name is: "+customerName);
    }
    void createCustomer(){//customerId=100 customerName="abc"
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the customer ID:");
        customerId=s.nextInt();
        System.out.println("Enter the customer Name: ");
        customerName=s.nextLine();
    }
    public static void main(String[] args) {
        Customer c1=new Customer();//constructor will be called implicitly

        //        c1.customerName="abc";
//        c1.customerId=100;
        c1.createCustomer();
        c1.display();// called as explicit function call

    }
}

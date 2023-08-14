package abstraction;

import java.util.Scanner;

public class PassportOffice {
    public static void main(String[] args) {
        HeadOffice ho=null;
        Scanner s=new Scanner(System.in);
        System.out.println("Select a Branch");
        System.out.println("1. Chennai \t 2.Bangalore");
        String branchName = s.nextLine();
        if(branchName.equalsIgnoreCase("Chennai")) {
            ho = new ChennaiOffice();
            ho.registration();
            ho.verification();
        }
        if(branchName.equalsIgnoreCase("Bangalore")) {
            ho = new BangaloreOffice();
            ho.registration();
            ho.verification();
        }
    }
}

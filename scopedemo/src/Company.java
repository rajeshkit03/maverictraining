import java.util.Scanner;

public class Company {
    int companyId;
    String companyName;
    float companyProfit;

    public Company(int companyId, String companyName, float companyProfit) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyProfit = companyProfit;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of company you want to create");
        int noOfCompanies=s.nextInt();//4
        Company[] companyList=new Company[noOfCompanies];

        for (int i = 0; i < noOfCompanies; i++) {
            System.out.println("Enter the company ID:");
            int id = s.nextInt();
            s.nextLine();
            System.out.println("Enter the company name: ");
            String name = s.nextLine();
            System.out.println("Enter the profit");
            float profit = s.nextFloat();
            Company c1=new Company(id,name,profit);
            companyList[i]=c1;
        }
    }
}

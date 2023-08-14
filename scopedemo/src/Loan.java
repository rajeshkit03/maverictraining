public class Loan {
    int loanId;
    String loanName;
    Loan(){
        System.out.println("constructor of loan class is called");
        System.out.println(loanId+" "+loanName);
    }
    void display(){
        System.out.println("display method is called");

        System.out.println(loanId+" "+loanName);
    }
    public static void main(String[] args) {
        Loan l1=new Loan();//jvm implicitly calls the constructor of Loan class
        l1.loanId=100;
        l1.loanName="ede";
        l1.display();// explicit call to display method

    }
}

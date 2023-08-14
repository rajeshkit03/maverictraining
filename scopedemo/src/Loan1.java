public class Loan1 {
    int loanId;
    String loanName;
    Loan1(){
        System.out.println("constructor of loan class is called");
        loanId=454;
        loanName="Housing Loan";
        System.out.println(loanId+" "+loanName);
    }
    Loan1(int id,String name){
        System.out.println("2 arg constructor of loan class is called");
        loanId = id;
        loanName = name;
        System.out.println(loanId+" "+loanName);
    }
    void display(){
        System.out.println("display method is called");
        System.out.println(loanId+" "+loanName);
    }

    public static void main(String[] args) {
        Loan1 l1=new Loan1();//jvm implicitly calls the constructor of Loan class - no arg constructor
        Loan1 l2=new Loan1(123,"Personal Loan");//jvm implicitly calls the constructor of Loan class
        Loan1 l3=new Loan1(222,"Jewel Loan");//jvm implicitly calls the constructor of Loan class
    }
}

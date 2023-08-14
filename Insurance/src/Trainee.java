import java.util.Scanner;

public class Trainee {
    int traineeId; //instance primitive variable
    String traineeName; //instance non primitive variable
    String traineePhone;////instance non primitive variable
    String traineeEmail;////instance non primitive variable
    static String department; // static non primitve variable
    static int departmentCode; ////static primitive variable
    int salary; //instance primitive variable
//    public static void showProfile(){
//        System.out.println(traineeName+" "+traineeId+"  "+traineePhone+" "+traineeEmail);
//    }
    public void learning(){
        System.out.println("got mastered in AWS and now Learning java");
    }

    public static void main(String[] args) {
        Trainee.departmentCode=4646;
        System.out.println(Trainee.departmentCode);
       // Trainee.showProfile();
        Scanner s=new Scanner(System.in);
        int traineeSalary; // local primitive variable
        String name="jshf"; // local non primitive variable
        traineeSalary=4545;
        System.out.println(traineeSalary);
        Trainee t1 = new Trainee();
        t1.traineeId=1234;
        t1.traineeName="abc";
        t1.learning();
        Trainee t2 = new Trainee();
        t2.traineeId=4567;
        t2.traineeName="bcd";
       // t1.showProfile();
        t1.learning();
    }
}

import java.sql.SQLOutput;

public class Train {
        int trainNumber; // instance variable
        String trainName;// instance variable
        static String locoName="Indian Railways";
        void display(){ // instance method
            System.out.println("Train Number is: "+trainNumber);
            System.out.println("Train Name is: "+trainName);
            System.out.println("Railways Name:"+Train.locoName);
        }
        void booking(){
            System.out.println("booking");
            display();
        }
    public static void main(String[] args) { //static method
        Train train=new Train();
        System.out.println("Main method Train Number is: "+train.trainNumber);
        System.out.println("Main method Train Name is: "+train.trainName);
        System.out.println("Main method Railways name: "+Train.locoName);
        train.display();
    }
}

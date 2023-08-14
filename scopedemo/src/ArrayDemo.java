import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] scores=new int[6];
        Scanner s=new Scanner(System.in);
        for (int i=0;i<6;i++){
            scores[i]=s.nextInt();
        }
        System.out.println(scores);
        for (int i=0;i<6;i++) {
            System.out.println(scores[i]);
        }

        Arrays.sort(scores);

        for (int i=0;i<6;i++) {
            System.out.println(scores[i]);
        }
        int index=Arrays.binarySearch(scores,23);

        System.out.println(index);





        String city="Chennai";

        String[] cities=new String[5];
        for (int i = 0; i < 5; i++) {
            cities[i]=s.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(cities[i]);
        }
    }
}

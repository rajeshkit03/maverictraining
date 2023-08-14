import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        HashSet<Integer> list=new HashSet();
        list.add(567);
        list.add(985);
        list.add(233);
        list.add(123);
        list.add(343);
        list.add(455);
        System.out.println(list);
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list);
//        }
        //advanced for loop
        for(Integer i:list){
            System.out.println(i);
        }
        //for iterator
       Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //for each loop iterating
        list.forEach(e->System.out.println(e));


//        ArrayList<Trainer> list2=new ArrayList();
//        Trainer t1=new Trainer(354,"xyz","java");
//        Trainer t2=new Trainer(355,"abc",".net");
//        Trainer t3=new Trainer(356,"erd","python");
//        list2.add(t1);
//        list2.add(t2);
//        list2.add(t3);
//
//        ArrayList<Integer> list=new ArrayList();
//        list.add(567);
//        list.add(985);
//        list.add(233);
//        list.add(123);
//        list.add(343);
//        list.add(455);
//        System.out.println(list.get(4));
//        ArrayList<String> list1=new ArrayList();
//        list1.add("chennai");
//        list1.add("mumbai");
//        list1.add("pune");

    }
}
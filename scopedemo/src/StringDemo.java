public class StringDemo {
    public static void main(String[] args) {
        String name="abc"; //string literal type immutable
        String name1=new String("abc");
            // object string class immutable
        System.out.println(name);
        System.out.println(name1);


        StringBuffer sb=new StringBuffer("maveric"); //muttable

        StringBuilder sb1=new StringBuilder("my company");//muttable

        System.out.println(sb);
        System.out.println(sb1);
    }

}

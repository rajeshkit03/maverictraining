public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return id+"  "+name;
    }

    public static void main(String[] args) {
        Object o=new Student();
        System.out.println(o.toString());
    }

}

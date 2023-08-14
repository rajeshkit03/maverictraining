package abstraction;

public class PhoneCalls {
    public static void main(String[] args) {
        Phone p=null;
        p=new Apple();
        p.makePhoneCall();

        p=new Samsung();
        p.makePhoneCall();

        p=new Oppo();
        p.makePhoneCall();
    }
}

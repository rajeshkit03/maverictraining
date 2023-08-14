package abstraction;

public class Oppo extends Phone{
    @Override
    public void makePhoneCall() {
        //making call in oppo has its own implementation
        System.out.println("making call in oppo has its own implementation");
    }
}

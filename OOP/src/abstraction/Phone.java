package abstraction;

public abstract class Phone {
    public int age;
    String name;
    private int phoneNo;
    protected String serviceProviderName;
    public abstract void makePhoneCall(); // abstract method
    public void sendSms(){ //implemented method or concrete method
        System.out.println("send sms");
    }
    public void display(){//implemented method or concrete method
        System.out.println("display");
    }

}

package abstraction;

public class ChennaiOffice implements HeadOffice{

    @Override
    public void registration() {
        System.out.println("chennai office registration");
    }

    @Override
    public void verification() {
        System.out.println("Aadhar as verification");
    }
}

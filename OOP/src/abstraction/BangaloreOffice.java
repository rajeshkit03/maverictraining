package abstraction;

public class BangaloreOffice implements HeadOffice {

    @Override
    public void registration() {
        System.out.println("Bangalore verification");
    }

    @Override
    public void verification() {
        System.out.println("voter id verification");
    }
}

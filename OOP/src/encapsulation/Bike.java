package encapsulation;
public class Bike {
    private String bikeModel;
    private String brandName;
    private int cost;

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel + "maveric";
    }

    public String getBrandName() {
        return brandName.toUpperCase();
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
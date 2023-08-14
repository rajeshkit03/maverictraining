public class Lic {
    public float premiumCalculator(int sumAssured,int planNoOfYears, float interestRate){
        float premiumAmount = sumAssured - planNoOfYears * interestRate;
        return premiumAmount;
    }
}

package practice;

public class LegalPerson extends Client {
    @Override
    public void take(double amountToTake) {
        double percent = 0.01;
        double commissionValue = amountToTake + amountToTake * percent;
        amount -= amountToTake < 0 || (amount - commissionValue) < 0 ? 0 : commissionValue;
    }
}

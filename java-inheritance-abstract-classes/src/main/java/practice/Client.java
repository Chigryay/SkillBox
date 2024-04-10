package practice;

public abstract class Client {
    protected double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {
        amount += amountToPut < 0 ? 0 : amountToPut;
    }

    public void take(double amountToTake) {
        amount -= amountToTake < 0 || (amount - amountToTake) < 0 ? 0 : amountToTake;
    }

    @Override
    public String toString() {
        return "Client{" +
                "amount=" + amount +
                '}';
    }
}

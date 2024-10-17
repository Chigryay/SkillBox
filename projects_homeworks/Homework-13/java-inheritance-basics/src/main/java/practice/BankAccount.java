package practice;

public class BankAccount {
  protected double amountMoney;

  public BankAccount() {
    amountMoney = 0;
  }

  public double getAmount() {
    return amountMoney;
  }

  public void put(double amountToPut) {
    amountMoney = amountToPut > 0 ?
            amountMoney + amountToPut :
            amountMoney;
  }

  public void take(double amountToTake) {
    amountMoney = amountToTake > 0 && (amountMoney - amountToTake) >= 0 ?
            amountMoney - amountToTake :
            amountMoney;
  }
}

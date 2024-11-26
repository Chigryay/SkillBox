package practice;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        // не забывайте, обращаться к методам и конструкторам родителя
        // необходимо используя super, например, super.put(10D);
        double COMMISSION = 0.01;
        double paymentCalc = amountMoney - (amountToTake + amountToTake * COMMISSION);
        amountMoney = amountToTake > 0 && paymentCalc >= 0 ?
                paymentCalc :
                amountMoney;
    }
}

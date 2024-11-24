package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        LocalDate now = LocalDate.now();
        if (lastIncome.isBefore(now.minusMonths(1))) {
            super.take(amountToTake);
        }
    }
}

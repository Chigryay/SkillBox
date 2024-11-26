package practice;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.put(100);
        bankAccount.take(10);
        System.out.println(bankAccount.getAmount());

        CardAccount cardAccount = new CardAccount();
        cardAccount.put(1000);
        cardAccount.take(100);
        System.out.println(cardAccount.getAmount());

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.put(200);
        depositAccount.take(50);
        System.out.println(depositAccount.getAmount());
    }
}

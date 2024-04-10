package practice;

public class IndividualBusinessman extends Client {
    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        amount -= amountToPut < 1000 ? amountToPut * 0.01 : amountToPut * 0.005;
    }
}

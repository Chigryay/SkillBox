public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 2);
        basket.print("Milk");
        basket.add("apple", 100, 5, 20);
        basket.print("Яблоки");
    }
}

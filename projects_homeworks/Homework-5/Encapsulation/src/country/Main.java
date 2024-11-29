package country;

public class Main {
    public static void main(String[] args) {
        Country russia = new Country("Russia");

        russia.setValue(100000);
        russia.setCapitalCountry("Moscow");

        System.out.println(russia);
    }
}

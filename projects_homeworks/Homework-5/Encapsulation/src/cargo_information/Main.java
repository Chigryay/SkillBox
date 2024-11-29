package cargo_information;

public class Main {
    public static void main(String[] args) {
        Cargo cargo = new Cargo(new Dimensions(1, 2, 3), 100, "Kemerovo",
                false, "AA111", true);

        Cargo cargo1 = cargo.setAddress("tomsk");

        System.out.println(cargo);
        System.out.println(cargo1);
    }
}

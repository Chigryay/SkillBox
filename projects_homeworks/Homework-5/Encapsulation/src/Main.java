import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    /*public static void main(String[] args) throws IOException {
        Elevator elevator = new Elevator(-1, 5);
        while (true) {
            System.out.println("Input pls number floor");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int numberFloor = Integer.parseInt(reader.readLine());

            elevator.move(numberFloor);
        }
    }*/
    public static void main(String[] args) {
        CargoInformation bed1 = new CargoInformation(new Dimensions(5, 10, 3), 30,
                "Kemerovo", true, "123adc", false);

        System.out.println(bed1);

        CargoInformation bed2 = bed1;

        bed2 = bed2.setAddress("Tomsk");
        bed2 = bed2.setDimensions(new Dimensions(1, 2, 3));
        bed2 = bed2.setWeight(100);

        System.out.println(bed2);
    }
}
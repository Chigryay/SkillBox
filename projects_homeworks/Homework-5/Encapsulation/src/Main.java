import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Elevator elevator = new Elevator(-1, 5);
        while (true) {
            System.out.println("Input pls number floor");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int numberFloor = Integer.parseInt(reader.readLine());

            elevator.move(numberFloor);
        }
    }
}
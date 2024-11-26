package elevator;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1, 5);

        for (int i = 0; i < 10; i++) {
            elevator.movieUp();
            System.out.println(elevator);
        }
    }
}

package elevator;

public class Elevator {
    private final int MIN_FLOOR;
    private final int MAX_FLOOR;
    private int currentFloor;

    public Elevator(int MIN_FLOOR, int MAX_FLOOR) {
        this.MIN_FLOOR = MIN_FLOOR;
        this.MAX_FLOOR = MAX_FLOOR;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int movieDown() {
        return currentFloor > MIN_FLOOR ?
                currentFloor-- :
                currentFloor;
    }

    public int movieUp() {
        return currentFloor < MAX_FLOOR ?
                currentFloor++ :
                currentFloor;
    }

    public int movie(int floor) {
        return floor >= MIN_FLOOR && floor <= MAX_FLOOR ?
                currentFloor = floor :
                currentFloor;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "currentFloor=" + currentFloor +
                '}';
    }
}

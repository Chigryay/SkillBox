public class Elevator {

    private final int minFloor;
    private final int maxFloor;

    private int currentFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1
                : currentFloor;
        System.out.printf("floor - %d\n", currentFloor);
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1
                : currentFloor;
        System.out.printf("floor - %d\n", currentFloor);
    }

    public void move(int numberFloor) {
        currentFloor = numberFloor <= maxFloor && numberFloor >= minFloor ?
                numberFloor : currentFloor;
        System.out.printf("floor - %d\n", currentFloor);
    }
}

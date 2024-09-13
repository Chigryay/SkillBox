package ru.skillbox;

public class Elevator {
    private final int MIN_FLOOR;
    private final int MAX_FLOOR;
    private int currentFloor;

    public Elevator(int MIN_FLOOR, int MAX_FLOOR) {
        this.MAX_FLOOR = MAX_FLOOR;
        this.MIN_FLOOR = MIN_FLOOR;
        currentFloor = MIN_FLOOR;
    }

    public void moveDown() {
        currentFloor = currentFloor > MIN_FLOOR ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < MAX_FLOOR ? currentFloor + 1 : currentFloor;
    }
    public void move(int numberFloor) {
        currentFloor = numberFloor >= MIN_FLOOR && numberFloor <= MAX_FLOOR ? numberFloor : currentFloor;
    }
    public void printCurrentFloor() {
        System.out.println("Current floor = " + currentFloor);
    }
}

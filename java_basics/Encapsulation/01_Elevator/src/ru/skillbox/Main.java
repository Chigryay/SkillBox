package ru.skillbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Elevator elevator = new Elevator(1, 9);
        elevator.printCurrentFloor();
        elevator.moveUp();
        elevator.printCurrentFloor();
        elevator.moveDown();
        elevator.moveDown();
        elevator.printCurrentFloor();
        int floor = Integer.parseInt(reader.readLine());
        elevator.move(floor);
        elevator.printCurrentFloor();
        floor = Integer.parseInt(reader.readLine());
        elevator.move(floor);
        elevator.printCurrentFloor();
    }
}
package org.example.SerializationTests;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Employee employee = new Employee("Alex", 12, 34.56);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/java/org/example/resources/employee.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/java/org/example/resources/employee.bin"))){

            outputStream.writeObject(employee);
            Employee employee1 = (Employee) inputStream.readObject();
            System.out.println(employee1);


            System.out.println("done");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

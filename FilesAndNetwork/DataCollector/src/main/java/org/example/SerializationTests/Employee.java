package org.example.SerializationTests;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int age;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    transient double salary;

}

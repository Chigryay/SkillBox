package org.example.ParseFiles;

import java.util.Date;

public record Dates_2(String name, String date) {
    @Override
    public String toString() {
        return "Dates_2{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}

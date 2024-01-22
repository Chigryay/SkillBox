package org.example.ParseFiles;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;
@JsonPropertyOrder({"name", "date"})
public record Dates_2(String name, String date) {
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}

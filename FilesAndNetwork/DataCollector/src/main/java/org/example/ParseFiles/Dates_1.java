package org.example.ParseFiles;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "date"})
public record Dates_1(String name, String date) {
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", date=" + date +
                "}";
    }
}

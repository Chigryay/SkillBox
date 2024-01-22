package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "date"})
public class Files {
    private String name;
    private String date;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", date='" + date + '\'';
    }
}

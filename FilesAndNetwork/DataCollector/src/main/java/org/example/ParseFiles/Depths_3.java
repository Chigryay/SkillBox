package org.example.ParseFiles;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Depths_3(String station_name, String depths) {
    @Override
    public String toString() {
        return "Depths_2{" +
                "station_name='" + station_name + '\'' +
                ", depths='" + depths + '\'' +
                '}';
    }
}

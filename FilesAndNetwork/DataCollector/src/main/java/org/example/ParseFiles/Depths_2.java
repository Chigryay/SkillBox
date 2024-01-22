package org.example.ParseFiles;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Depths_2 {
    @JsonProperty("station_name")
    public String station_name;
    @JsonProperty("depth")
    public String depth;

    @Override
    public String toString() {
        return "\nDepth_2 {\n" +
                "station_name='" + station_name + '\'' +
                ", \ndepth='" + depth + '\'' + "\n" +
                '}';
    }
}

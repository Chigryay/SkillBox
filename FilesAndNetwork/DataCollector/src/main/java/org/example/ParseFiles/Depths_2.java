package org.example.ParseFiles;

import com.fasterxml.jackson.annotation.JsonProperty;


    public record Depths_2(String station_name, String depths) {
        @Override
        public String toString() {
            return "Depths_2{" +
                    "station_name='" + station_name + '\'' +
                    ", depths='" + depths + '\'' +
                    '}';
        }
    }
   /* @JsonProperty("station_name")
    private final String station_name;
    @JsonProperty("depth")
    private final String depth;

    public Depths_2(String stationName, String depth) {
        station_name = stationName;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "\nDepth_2 {\n" +
                "station_name='" + station_name + '\'' +
                ", \ndepth='" + depth + '\'' + "\n" +
                '}';
    }*/


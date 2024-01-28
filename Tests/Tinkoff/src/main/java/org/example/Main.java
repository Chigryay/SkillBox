package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "code999andcodec1andcocode888";
        text = text.replaceAll("code\\d+", "???");
        System.out.println(text);
    }
}
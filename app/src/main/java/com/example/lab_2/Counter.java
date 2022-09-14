package com.example.lab_2;

public class Counter {
    public int Chars(String inputText) {
        return inputText.length();
    }
    public int Words(String inputText_2) {
        return inputText_2.trim().split("\\W+").length;
    }
}
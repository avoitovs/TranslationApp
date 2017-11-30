package com.example.antons.translationapp;

/**
 * Created by antons on 29/11/2017.
 */

public class Word {

    private String antiNumber;
    private String number;

    public String getAntiNumber() {
        return antiNumber;
    }


    public String getNumber() {
        return number;
    }


    public Word(String antiNumber, String number) {
        this.antiNumber = antiNumber;
        this.number = number;
    }
}

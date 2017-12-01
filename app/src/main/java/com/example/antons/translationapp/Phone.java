package com.example.antons.translationapp;

/**
 * Created by antons on 30/11/2017.
 */

public class Phone {

    private int id;
    private String name;
    private double price;
    private int resourceIDPicture;


    public Phone(int id, String name, double price, int resourceIDPicture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.resourceIDPicture = resourceIDPicture;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getResourceIDPicture() {
        return resourceIDPicture;
    }

}

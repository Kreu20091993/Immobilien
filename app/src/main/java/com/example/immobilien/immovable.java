package com.example.immobilien;

import java.util.List;

public class immovable {

    private String location;
    private String description;
    private int Price;
    private int space;


    public immovable(String location, String description, int price, int space) {
        this.location = location;
        this.description = description;
        Price = price;
        this.space = space;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}

package com.example.immobilien;

public class filter {

    private String location;
    private int radius;
    private int price;
    private int space;
    private boolean onlyFav;
    private boolean showAll;

    public filter(String location, int radius, int price, int space, boolean onlyFav, boolean showAll) {
        this.location = location;
        this.radius = radius;
        this.price = price;
        this.space = space;
        this.onlyFav = onlyFav;
        this.showAll = showAll;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean isOnlyFav() {
        return onlyFav;
    }

    public void setOnlyFav(boolean onlyFav) {
        this.onlyFav = onlyFav;
    }

    public boolean isShowAll() {
        return showAll;
    }

    public void setShowAll(boolean showAll) {
        this.showAll = showAll;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

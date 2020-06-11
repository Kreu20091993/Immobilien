package com.example.immobilien;

import java.util.List;

public class user {

    private int id;
    private String username;
    private String pw;
    private List<immovable> favImmos;
    private List<immovable> unwantedImmos;
    private List<filter> savedFilter;

    public user(int id, String username, String pw, List<immovable> favImmos, List<immovable> unwantedImmos, List<filter> savedFilter) {
        this.id = id;
        this.username = username;
        this.pw = pw;
        this.favImmos = favImmos;
        this.unwantedImmos = unwantedImmos;
        this.savedFilter = savedFilter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public List<immovable> getFavImmos() {
        return favImmos;
    }

    public void setFavImmos(List<immovable> favImmos) {
        this.favImmos = favImmos;
    }

    public List<immovable> getUnwantedImmos() {
        return unwantedImmos;
    }

    public void setUnwantedImmos(List<immovable> unwantedImmos) {
        this.unwantedImmos = unwantedImmos;
    }

    public List<filter> getSavedFilter() {
        return savedFilter;
    }

    public void setSavedFilter(List<filter> savedFilter) {
        this.savedFilter = savedFilter;
    }
}

package com.myapplicationdev.android.tw_listview;

public class Module {
    private String name;
    private boolean star;
    private String year;
    public Module(String year, String name, boolean star) {
        this.name = name;
        this.star = star;
    }
    public String getName() {
        return name;
    }
    public boolean isStar() {
        return star;
    }
    public String getYear() {
        return year;
    }
}

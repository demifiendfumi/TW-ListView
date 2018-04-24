package com.myapplicationdev.android.tw_listview;

public class Module {
<<<<<<< HEAD
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
=======
    private String module;
    private String year;
    private boolean program;
    public Module(String year, String module, boolean program){
        this.year = year;
        this.module = module;
        this.program = program;
    }

    public String getYear() {
        return year;
    }

    public String getModule(){
        return module;
    }

    public boolean isProgram() {
        return program;
    }
>>>>>>> origin/master
}

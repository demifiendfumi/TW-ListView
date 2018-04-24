package com.myapplicationdev.android.tw_listview;

public class Module {


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
}

package com.myapplicationdev.android.tw_listview;

public class Module {


    private String module;

    private boolean program;
    public Module( String module, boolean program){

        this.module = module;
        this.program = program;
    }


    public String getModule(){
        return module;
    }

    public boolean isProgram() {
        return program;
    }
}

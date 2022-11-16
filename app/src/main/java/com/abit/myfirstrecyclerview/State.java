package com.abit.myfirstrecyclerview;

public class State {
    private String name;
    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public State(String name, String num) {
        this.name = name;
        this.num = num;
    }
}

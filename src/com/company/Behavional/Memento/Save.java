package com.company.Behavional.Memento;


public class Save {

    private String level;

    public String getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }

    private int time;

    public Save(String level, int time) {
        this.level = level;
        this.time = time;
    }
}

package com.company.Behavional.Observe;

public class State {
    int temp;
    int press;

    public int getTemp() {
        return temp;
    }

    public int getPress() {
        return press;
    }

    public State(int temp, int press) {
        this.temp = temp;
        this.press = press;
    }
}

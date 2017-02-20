package com.company.Behavional.Observe;

public class ConcreteObserve implements Observe {

    int temp;
    int press;

    @Override
    public String toString() {
        return "ConcreteObserve{" +
                "temp=" + temp +
                ", press=" + press +
                '}';
    }

    @Override
    public void update(ConcreteSubject subject) {
        State state = subject.getState();
        temp = state.getTemp();
        press = state.getPress();
    }
}

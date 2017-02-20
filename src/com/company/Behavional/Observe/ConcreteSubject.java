package com.company.Behavional.Observe;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {

    int temperature;
    int pressure;

    public State getState() {
        return new State(temperature, pressure);
    }

    public void setState(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserve();
    }

    private List<Observe> observes =  new LinkedList<>();

    @Override
    public void addObserve(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void notifyObserve() {
        for (Observe o:observes) {
            o.update(this); // or o.update(new State(temperature, pressure));
        }
    }

    @Override
    public String toString() {
        return "ConcreteSubject{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                '}';
    }
}

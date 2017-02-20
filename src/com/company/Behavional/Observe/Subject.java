package com.company.Behavional.Observe;

interface Subject {
    void addObserve(Observe observe);
    void removeObserve(Observe observe);
    void notifyObserve();

}

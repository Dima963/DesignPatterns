package com.company.Creational.Prototype;

public class Developer extends Prototype {

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "stage=" + stage +
                ", status='" + status + '\'' +
                '}';
    }

    int stage;
    String status;

    public Developer(int stage, String status) {
        this.stage = stage;
        this.status = status;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

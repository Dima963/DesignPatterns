package com.company.Creational.Builder;

public class WebSite {

    private String name;
    private int price;
    private String cms;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCms(String cms) {
        this.cms = cms;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cms='" + cms + '\'' +
                '}';
    }

}

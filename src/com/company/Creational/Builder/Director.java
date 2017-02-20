package com.company.Creational.Builder;

public class Director {
    WebBuilder builder;

    public void setWebBuilder(WebBuilder builder) {
        this.builder = builder;
    }

    WebSite createSite() {

        builder.createSite();
        builder.createName();
        builder.createCMS();
        builder.createPrice();

        WebSite newSite = builder.getSite();
        return newSite;
    }
}

package com.company.Creational.Builder;

public abstract class WebBuilder {

    WebSite site;

    public WebSite getSite() {
        return site;
    }

    public void createSite() {
        this.site = new WebSite();
    }

    abstract void createName();
    abstract void createPrice();
    abstract void createCMS();

}

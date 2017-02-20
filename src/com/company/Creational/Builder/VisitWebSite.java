package com.company.Creational.Builder;


public class VisitWebSite extends WebBuilder {
    @Override
    void createName() {
        site.setName("PersonalPage");
    }

    @Override
    void createPrice() {
        site.setPrice(100);
    }

    @Override
    void createCMS() {
        site.setCms("Wordpress");
    }
}

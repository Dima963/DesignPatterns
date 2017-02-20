package com.company.Creational.Builder;

/**
 * Created by Dima on 20.02.2017.
 */
public class EnterpriseWebSite extends WebBuilder {
    @Override
    void createName() {
        site.setName("Enterprise");
    }

    @Override
    void createPrice() {
        site.setPrice(1000);
    }

    @Override
    void createCMS() {
        site.setCms("Ucoz");

    }
}

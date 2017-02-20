package com.company.Creational.Builder;

public class BuilderRunner {
    public static void main(String[] args) {

        Director director  =  new Director();
        director.setWebBuilder(new EnterpriseWebSite());
        WebSite site = director.createSite();

        System.out.println(site);

    }

}

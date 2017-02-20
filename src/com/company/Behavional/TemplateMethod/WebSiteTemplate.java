package com.company.Behavional.TemplateMethod;

public abstract class WebSiteTemplate {
    public void showPahe(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }
    public abstract void showPageContent();
}

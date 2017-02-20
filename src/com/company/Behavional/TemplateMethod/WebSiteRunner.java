package com.company.Behavional.TemplateMethod;

/**
 * Created by Dima on 19.02.2017.
 */
public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcome = new WelcomPage();
        WebSiteTemplate news =  new NewsPage();
        welcome.showPahe();
        news.showPahe();

    }
}

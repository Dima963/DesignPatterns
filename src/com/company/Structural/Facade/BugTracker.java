package com.company.Structural.Facade;

/**
 * Created by Dima on 15.02.2017.
 */
public class BugTracker {
    private  boolean isActiveSprint;

    public boolean isActiveSprint() {
        return isActiveSprint;
    }

    public  void  StarSprint(){
        System.out.println("Sprint is active");
        isActiveSprint =  true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active");
        isActiveSprint = false;
    }


}

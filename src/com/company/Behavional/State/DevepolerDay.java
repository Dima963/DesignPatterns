package com.company.Behavional.State;


/**
 * Created by Dima on 19.02.2017.
 */
public class DevepolerDay {
    public static void main(String[] args) {
        Activity activity =  new Sleep();
        Developer developer =  new Developer();
        developer.setActivity(activity);

        for (int i  = 0; i<10; i++){
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}

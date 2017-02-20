package com.company.Behavional.State;

/**
 * Created by Dima on 19.02.2017.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Sleep)
            setActivity(new Training());
        else if(activity instanceof Training)
            setActivity(new WriteCode());
        else if(activity instanceof WriteCode)
            setActivity(new Reading());
        else if(activity instanceof Reading)
            setActivity(new Sleep());
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}

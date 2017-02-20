package com.company.Behavional.Visitor;

/**
 * Created by Dima on 19.02.2017.
 */
public class Project  implements projectElement{

    projectElement[] projectElements;
    public Project() {
        this.projectElements = new projectElement[]{

                new projectClass(),
        new DataBase(),
        new Test()
        };
    }
    @Override
    public void beWritten(Developer developer) {

        for (projectElement element:projectElements
             ) {

            element.beWritten(developer);
        }
    }
}

package com.company.Behavional.Iterator;

/**
 * Created by Dima on 17.02.2017.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
         String[] skills =  {"Java", "Spring", "Hibernate", "PostgereSQL"};
        JavaDeveloper javaDeveloper =  new JavaDeveloper("Dima",skills );
        Iterator iterator =  javaDeveloper.getIterator();
        System.out.println("Developer" + javaDeveloper.getName() );
        System.out.println("Skills");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString()+ " ");
        }
    }
}

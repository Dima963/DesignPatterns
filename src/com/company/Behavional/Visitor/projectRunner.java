package com.company.Behavional.Visitor;

public class projectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer jun =  new JuniorDeveloper();
        Developer sin =  new SeniorJavaDeveloper();
        System.out.println("junior is action....");
        project.beWritten(jun);
        System.out.println("senior is action....");
        project.beWritten(sin);
    }
}

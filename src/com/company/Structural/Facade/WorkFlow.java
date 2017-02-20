package com.company.Structural.Facade;

/**
 * Facade
 */
public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem(){
        job.doJob();
        bugTracker.StarSprint();
        developer.DoJobBeforeDeadline(bugTracker);
    }

}

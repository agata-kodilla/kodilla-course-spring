package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("execute driving task");
    }

    @Override
    public String getTaskName() {
        return "driving task";
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class BoardConfig {

    @Bean
    public Board getBoard(@Qualifier("toDoList") TaskList toDoList,
                          @Qualifier("inProgressList") TaskList inProgressList,
                          @Qualifier("doneList") TaskList doneList) {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        TaskList taskList = new TaskList();
        taskList.getTasks().add("inprogressss");
        return taskList;
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
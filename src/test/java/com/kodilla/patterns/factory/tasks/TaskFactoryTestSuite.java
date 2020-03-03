package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        ShoppingTask shopping = (ShoppingTask) task.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        PaintingTask painting = (PaintingTask) task.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("painting task", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        DrivingTask driving = (DrivingTask) task.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("driving task", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }
}
package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.agata");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2, 8);
        //Then
        Assert.assertEquals(10, add, 0);
    }

    @Test
    public void testSubMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.agata");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.sub(2, 8);
        //Then
        Assert.assertEquals(-6, add, 0);
    }

    @Test
    public void testMulMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.agata");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.mul(2, 8);
        //Then
        Assert.assertEquals(16, add, 0);
    }

    @Test
    public void testDivMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.agata");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.div(2, 8);
        //Then
        Assert.assertEquals(0.25, add, 0);
    }
}
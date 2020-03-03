package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;


    @Test
    public void testGetLastLog() {
        //Given
        //When
        logger = Logger.getInstance();
        logger.log("111");
        //Then
        Assert.assertEquals("111", logger.getLastLog());
    }


}

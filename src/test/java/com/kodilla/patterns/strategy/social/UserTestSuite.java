package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mil = new Millenials("Mil MilSurname");
        User zgen = new ZGeneration("Zgen ZgenSurname");
        User ygen = new YGeneration("Ygen YgenSurname");

        //When
        String milShouldShare = mil.typeOfSocial();
        System.out.println("Mil should: " + milShouldShare);
        String zgenShouldShare = zgen.typeOfSocial();
        System.out.println("Zgen should: " + zgenShouldShare);
        String ygenShouldShare = ygen.typeOfSocial();
        System.out.println("Ygen should: " + ygenShouldShare);

        //Then
        Assert.assertEquals("Share type = Snapchat", milShouldShare);
        Assert.assertEquals("Share type = Facebook", zgenShouldShare);
        Assert.assertEquals("Share type = Twitter", ygenShouldShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mil = new Millenials("Mil MilSurname");

        //When
        String milShouldShare = mil.typeOfSocial();
        System.out.println("Mil should: " + milShouldShare);
        mil.setSocialPublisher(new TwitterPublisher());
        milShouldShare = mil.typeOfSocial();
        System.out.println("Mil now should: " + milShouldShare);

        //Then
        Assert.assertEquals("Share type = Twitter", milShouldShare);
    }
}
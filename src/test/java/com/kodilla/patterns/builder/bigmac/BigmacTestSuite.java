package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BigmacTestSuite {
    @Test
    public void testIngredientsInBigmac() {
        //Given
        Bigmac bigmac = new BigmacBuilder()
                .bun("normal")
                .burgers(4)
                .ingredients(new ArrayList<>(Arrays.asList(Ingredient.BECON, Ingredient.CHEESE)))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new BigmacBuilder()
                .bun("normal")
                .burgers(4)
                .build();
        System.out.println(bigmac);
        //When
        //Then
        Assert.assertEquals(bigmac.toString(), new Bigmac("normal", null, 4, null).toString());
    }
}
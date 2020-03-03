package com.kodilla.patterns.builder.bigmac;

import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private final List<Ingredient> ingredients;

    public Bigmac(String bun, String sauce, int burgers, List<Ingredient> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}

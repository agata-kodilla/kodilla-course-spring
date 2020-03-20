package com.kodilla.patterns.builder.bigmac;

import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private final List<Ingredient> ingredients;

    public Bigmac(String bun, int burgers, String sauce, List<Ingredient> ingredients) {
        if (bun == null) {
            throw new NullPointerException("bun");
        } else if (burgers == 0) {
            throw new NullPointerException("burgers");
        } else {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = ingredients;
        }
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

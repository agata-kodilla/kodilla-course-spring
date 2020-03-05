package com.kodilla.patterns.builder.bigmac;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private final List<Ingredient> ingredients;

    public Bigmac(@NotNull String bun, String sauce, @NotNull int burgers, List<Ingredient> ingredients) {
        if(bun==null){
            throw new NullPointerException("bun");
        }
        else if(burgers == 0) {
            throw new NullPointerException("burgers");
        } else {
            this.bun = bun;
            this.sauce = sauce;
            this.burgers = burgers;
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

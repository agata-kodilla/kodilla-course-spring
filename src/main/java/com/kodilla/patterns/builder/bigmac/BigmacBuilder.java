package com.kodilla.patterns.builder.bigmac;

import javax.validation.constraints.NotNull;
import java.util.List;

public final class BigmacBuilder {
    private String bun;
    private String sauce;
    private int burgers;
    private List<Ingredient> ingredients;

    public BigmacBuilder() {
    }

    public static BigmacBuilder aBigmac() {
        return new BigmacBuilder();
    }

    public BigmacBuilder bun(String bun) {
        this.bun = bun;
        return this;
    }

    public BigmacBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public BigmacBuilder burgers(int burgers) {
        this.burgers = burgers;
        return this;
    }

    public BigmacBuilder ingredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public Bigmac build() {
        return new Bigmac(bun, burgers, sauce, ingredients);
    }

    public BigmacBuilder addBurger() {
        burgers += 1;
        return this;
    }
}

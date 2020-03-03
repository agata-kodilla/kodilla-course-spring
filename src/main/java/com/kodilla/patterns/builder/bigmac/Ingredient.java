package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {

   // sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki, krewetki, ser

    LETTUCE("lettuce"),
    ONION("onion"),
    BECON("becon"),
    CUCUMBER("cucumber"),
    CHILI("chili"),
    MUSHROOM("mushroom"),
    PRAWNS("prawns"),
    CHEESE("cheese");


    private final String text;

    /**
     * @param text
     */
    Ingredient(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}

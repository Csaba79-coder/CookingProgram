package ingredients.rawmaterial;

import ingredients.Ingredients;

public class Tomato extends Ingredients {

    private String color;

    public Tomato(String name, double amount, String color) {
        super(name, amount, "kg", "whole");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

package ingredients.rawmaterial;

import ingredients.Ingredients;

public class Onion extends Ingredients {

    private String color;
    private String type;

    public Onion(String name, double amount, String color, String type) {
        super(name, amount, "pieces", "whole");
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

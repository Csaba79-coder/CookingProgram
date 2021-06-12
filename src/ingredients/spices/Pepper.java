package ingredients.spices;


public class Pepper extends Spices {
    private String color;


    public Pepper(String name, double amount, String state, String color) {
        super(name, amount, state);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

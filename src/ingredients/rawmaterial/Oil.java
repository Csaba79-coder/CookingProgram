package ingredients.rawmaterial;

import ingredients.Ingredients;

public class Oil extends Ingredients {

    private String type;
    private String brand;

    public Oil(String name, double amount, String type, String brand) {
        super(name, amount, "dl", "liquid");
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

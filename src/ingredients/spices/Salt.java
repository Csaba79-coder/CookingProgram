package ingredients.spices;


public class Salt extends Spices {
    private String type;
    private boolean isSeaSalt;

    public Salt(String name, double amount, String state, String type, boolean isSeaSalt) {
        super(name, amount, state);
        this.type = type;
        this.isSeaSalt = isSeaSalt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSeaSalt() {
        return isSeaSalt;
    }

    public void setSeaSalt(boolean seaSalt) {
        isSeaSalt = seaSalt;
    }
}

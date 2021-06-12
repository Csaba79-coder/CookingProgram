package ingredients.rawmaterial;


public class Egg extends RawMaterial {
    private String type;
    private String size;
    private boolean isUV = true;
    // private String[] activities = {"washing", "break up", "cook"};

    public Egg(String name, double amount, String type, String size) {
        super(name, amount, "pieces", "whole", true);
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isUV() {
        return isUV;
    }

    public void setUV(boolean UV) {
        isUV = UV;
    }

}

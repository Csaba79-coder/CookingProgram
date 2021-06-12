package ingredients.rawmaterial;

import ingredients.Ingredients;

public class RawMaterial extends Ingredients {

    private boolean needsToBeClean = false;
    private boolean isCut = false;

    public RawMaterial(String name, double amount, String unit, String state, boolean needsToBeClean) {
        super(name, amount, unit, state, new String[]{"not ready"});
        this.needsToBeClean = needsToBeClean;
    }

    public boolean isNeedsToBeClean() {
        return needsToBeClean;
    }

    public void setNeedsToBeClean(boolean needsToBeClean) {
        this.needsToBeClean = needsToBeClean;
    }

    public boolean isCut() {
        return isCut;
    }

    public void setCut(boolean cut) {
        isCut = cut;
    }
}

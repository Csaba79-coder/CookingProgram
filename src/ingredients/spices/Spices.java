package ingredients.spices;

import ingredients.Ingredients;

public class Spices extends Ingredients {

    private boolean needsToBeClean = false;

    public Spices(String name, double amount, String state) {
        super(name, amount, "gram", state);
    }

    public boolean isNeedsToBeClean() {
        return needsToBeClean;
    }

    public void setNeedsToBeClean(boolean needsToBeClean) {
        this.needsToBeClean = needsToBeClean;
    }
}

package actitvities;

import ingredients.Ingredients;

public class KitchenActivities {

    Ingredients[] ingredients;

    public KitchenActivities(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    //  needsToBeClean if true make a clean!
    // isNeedsToBeClean() return true or false ...

    public void cleanIngredients() {
        for (Ingredients ingredient : ingredients) {
            String[] activities = ingredient.getActivities();
        }
    }

    public boolean isNeedToBeClean(String[] activities) {
        for (int i = 0; i < activities.length; i++) {
            if (activities[i] == "clean") {
                return true;
            }
        }
        return false;
    }
}

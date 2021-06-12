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

    //         this.activities = new String[]{"uncleaned", "uncut", "uncooked"};

    public static void cleanTheStuff(String[] activities, String activity) {
        for (int i = 0; i < activities.length; i++) {
            if (activities[i] == activity) {
                activities[i] = activity.substring(2);
                System.out.println(activities[i]);
            }
        }
    }
}

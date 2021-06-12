import actitvities.KitchenActivities;
import ingredients.Ingredients;
import recipe.Lecso;

public class Main {

    public static void main(String[] args) {

        Lecso lecso = new Lecso();
        KitchenActivities kitchenActivities = new KitchenActivities(lecso.getIngredients());

        kitchenActivities.makeAllSteps();

    }
}

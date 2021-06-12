

public class Main {

    public static void main(String[] args) {









        tools.Bowl bowl = new tools.Bowl("bowl", "metal", 1, true, 10, "liter");
        tools.CookingPot cookingPotTomato = new tools.CookingPot("cookingPotTomato", "metal", 1, true, 10, "liter");
        tools.CookingPot cookingPotPaprika = new tools.CookingPot("cookingPotPaprika", "metal", 1, true, 10, "liter");
        tools.Knife knife = new tools.Knife("knife", "metal", 1, true, "Kitchen");
        tools.Tools kitchenSpoon = new tools.Tools("kitchenSpoon", "wooden", 1, true);

        tools.Stove electricStove = new tools.Stove("electricStove", false, 4, "pieces");
    }
}

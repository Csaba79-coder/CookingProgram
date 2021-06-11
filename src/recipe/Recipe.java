package recipe;

import ingredients.rawmaterial.Paprika;

public class Recipe {

    Paprika paprikaSweet = new Paprika("paprikaSweet", 0.5, "kg", "whole", "green", false, "regular TV");
    Paprika paprikaHot = new Paprika("paprikaHot", 0.5, "kg", "whole", "red and green", true, "Bogyiszló");
    Paprika paprikaPowder = new Paprika("paprikaPowder", 2, "teaspoon", "powder", "red", true, "Kalocsa");
    chef.ingredients.rawmaterial.Tomato tomato = new chef.ingredients.rawmaterial.Tomato("tomato", 0.5, "kg", "whole", "red");
    chef.ingredients.rawmaterial.Onion onion = new chef.ingredients.rawmaterial.Onion("onion", 2, "pieces", "whole", "bronze red","regular");
    chef.ingredients.rawmaterial.Oil oil = new chef.ingredients.rawmaterial.Oil("oil", 1, "dl", "liquid", "olive, extra virgin", "Bertolli");
    chef.ingredients.Ingredients water = new chef.ingredients.Ingredients("water", 1, "liter", "liquid");
    chef.ingredients.spices.Pepper pepper = new chef.ingredients.spices.Pepper("pepper", 6, "turn", "powder", "black");
    chef.ingredients.spices.Salt salt = new chef.ingredients.spices.Salt("salt", 6 , "turn", "powder", "iod", true);
    chef.ingredients.rawmaterial.Egg egg = new chef.ingredients.rawmaterial.Egg("egg", 6, "pieces", "whole", "farm", "XL", true);
    chef.ingredients.rawmaterial.Sausage sausage = new chef.ingredients.rawmaterial.Sausage("sausage", 1, "pair", "whole", "Gyulai", true, true);
}

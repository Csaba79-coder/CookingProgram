package recipe;

import ingredients.rawmaterial.Paprika;

public class Recipe {

    Paprika paprikaSweet = new Paprika("paprikaSweet", 0.5, "kg", "whole", "green", false, "regular TV");
    Paprika paprikaHot = new Paprika("paprikaHot", 0.5, "kg", "whole", "red and green", true, "Bogyiszló");
    Paprika paprikaPowder = new Paprika("paprikaPowder", 2, "teaspoon", "powder", "red", true, "Kalocsa");
    ingredients.rawmaterial.Tomato tomato = new ingredients.rawmaterial.Tomato("tomato", 0.5, "kg", "whole", "red");
    ingredients.rawmaterial.Onion onion = new ingredients.rawmaterial.Onion("onion", 2, "pieces", "whole", "bronze red","regular");
    ingredients.rawmaterial.Oil oil = new ingredients.rawmaterial.Oil("oil", 1, "dl", "liquid", "olive, extra virgin", "Bertolli");
    ingredients.Ingredients water = new ingredients.Ingredients("water", 1, "liter", "liquid");
    ingredients.spices.Pepper pepper = new ingredients.spices.Pepper("pepper", 6, "turn", "powder", "black");
    ingredients.spices.Salt salt = new ingredients.spices.Salt("salt", 6 , "turn", "powder", "iod", true);
    ingredients.rawmaterial.Egg egg = new ingredients.rawmaterial.Egg("egg", 6, "pieces", "whole", "farm", "XL", true);
    ingredients.rawmaterial.Sausage sausage = new ingredients.rawmaterial.Sausage("sausage", 1, "pair", "whole", "Gyulai", true, true);
}

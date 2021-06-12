package recipe;

import ingredients.rawmaterial.Paprika;
import ingredients.spices.PaprikaPowder;

public class Lecso {

    Paprika paprikaSweet = new Paprika("paprikaSweet", 0.5, "green", false, "regular TV");
    Paprika paprikaHot = new Paprika("paprikaHot", 0.5, "red and green", true, "Bogyiszló");
    ingredients.rawmaterial.Tomato tomato = new ingredients.rawmaterial.Tomato("tomato", 0.5, "red");

    ingredients.rawmaterial.Onion onion = new ingredients.rawmaterial.Onion("onion", 2, "bronze red","regular");

    ingredients.rawmaterial.Egg egg = new ingredients.rawmaterial.Egg("egg", 6, "farm", "XL");

    ingredients.spices.Pepper pepper = new ingredients.spices.Pepper("pepper", 1, "powder", "black");
    ingredients.spices.Salt salt = new ingredients.spices.Salt("salt", 1, "powder", "iod", true);
    PaprikaPowder paprikaPowder = new PaprikaPowder("paprikaPowder", 5, "powder", "red", true, "Kalocsa");

    ingredients.rawmaterial.Oil oil = new ingredients.rawmaterial.Oil("oil", 1, "olive, extra virgin", "Bertolli");
    ingredients.Ingredients water = new ingredients.Ingredients("water", 1, "liter", "liquid");

    ingredients.rawmaterial.Sausage sausage = new ingredients.rawmaterial.Sausage("sausage", 1, "Gyulai", true, true);

}

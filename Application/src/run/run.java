package run;

import model.data.Saver;
import model.entities.Ingredient;
import model.entities.Meal;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class run {

    public static void main(String[] args) {
        Set<Meal> meals = new HashSet<Meal>();

        Set<Ingredient> ingredients = new HashSet<Ingredient>();
        ingredients.add(new Ingredient(1L, "Beef"));
        ingredients.add(new Ingredient(1L, "Onion"));
        ingredients.add(new Ingredient(1L, "Potatoes"));
        ingredients.add(new Ingredient(1L, "Ketchup"));
        ingredients.add(new Ingredient(1L, "Brown Sugar"));
        ingredients.add(new Ingredient(1L, "Eggs"));
        ingredients.add(new Ingredient(1L, "Salt"));
        ingredients.add(new Ingredient(1L, "Pepper"));
        ingredients.add(new Ingredient(1L, "Green Beans"));
        ingredients.add(new Ingredient(1L, "Butter"));
        ingredients.add(new Ingredient(1L, "Milk"));
        Meal meal1 = new Meal(1L, "MeatLoaf", "Meatloaf, Mashed Potatos, Green beans", LocalDate.parse("2023-12-11"), ingredients);
        meals.add(meal1);
        Saver saver = new Saver();
        saver.save(meals);
    }

}

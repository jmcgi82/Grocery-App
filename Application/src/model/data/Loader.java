package model.data;

import model.entities.Ingredient;
import model.entities.Meal;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Loader {

    private File file;

    public Loader() {
        String location = "list.txt";
        this.file = new File(ClassLoader.getSystemResource(location).getFile());
    }

    /**
     * Items are loaded from text file, all files load from list.txt and must be in the following format:
     * {ID,NAME,DESCRIPTION,LAST_USED,<{NAME=ID}:{NAME=ID}>}
     */
    public Set<Meal> load() {
        Set<Meal> meals = new HashSet<Meal>();
        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                //remove preceding and ending curly
                next = next.substring(1, next.length() - 1);
                //split by commas
                String[] temp = next.split(",");

                //Create new object
                Meal meal = new Meal();

                //Set ID
                meal.setId(Long.parseLong(temp[0]));

                //Set name
                meal.setName(temp[1]);

                //Set description
                meal.setDescription(temp[2]);

                //set last_used
                meal.setLast_used(LocalDate.parse(temp[3]));

                //set ingredientList
                temp[4] = temp[4].substring(1, temp[4].length() - 1);
                String[] tempIng = temp[4].split(":");
                for (int i = 0; i < tempIng.length; i++) {
                    tempIng[i] = tempIng[i].substring(1, tempIng[i].length() - 1);
                    String[] tempF = tempIng[i].split("=");
                    Ingredient in = new Ingredient(Long.parseLong(tempF[1]), tempF[0]);
                    meal.addIngredient(in);
                }

                meals.add(meal);
            }
            scanner.close();
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }

        return meals;
    }


}

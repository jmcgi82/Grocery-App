package model.data;

import model.entities.Ingredient;
import model.entities.Meal;

import java.io.File;
import java.io.FileWriter;
import java.util.Set;

public class Saver {

    private File file;
    private final String location = "list.txt";

    public Saver() {
        this.file = new File(location);
    }

    /**
     * {ID,NAME,DESCRIPTION,LAST_USED,<{NAME=ID}:{NAME=ID}>}
     */
    public void save(Set<Meal> meals) {
        try {
            FileWriter writer = new FileWriter(this.file);

            for (Meal meal : meals) {
                String res = "";
                //Create ingredient string
                String ingRes = "";
                int first = 0;
                for (Ingredient ingredient : meal.getIngredients()) {
                   String tempIng = "";
                   if (first != 0) {
                       tempIng += ",";
                   } else {
                       first = 1;
                   }
                   tempIng +=  "{" + ingredient.getName() + "=" + ingredient.getID() + "}";

                }
                ingRes = "<" + ingRes + ">";
                res = "{" + meal.getId() + "," + meal.getName() + "," + meal.getDescription() + "," + meal.getLast_used() + "," + ingRes + "}";

                res = "{" + res + "}";
                System.out.println(res);
                writer.write(res);
            }
            System.out.println("test");
            writer.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}

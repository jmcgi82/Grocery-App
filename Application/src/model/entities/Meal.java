package model.entities;

import model.entities.Ingredient;

import java.time.LocalDate;
import java.util.Date;
import java.util.DuplicateFormatFlagsException;
import java.util.Set;

public class Meal {

    private Long id;

    private String name;

    private String description;

    private LocalDate last_used;

    private Set<Ingredient> ingredients;

    public Meal(Long id, String name, String description, LocalDate last_used, Set<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.last_used = last_used;
        this.ingredients = ingredients;
    }

    public Meal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLast_used() {
        return last_used;
    }

    public void setLast_used(LocalDate last_used) {
        this.last_used = last_used;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) throws DuplicateFormatFlagsException {
        if (this.ingredients.contains(ingredient)) {
            throw new DuplicateFormatFlagsException("Duplicate Item Added.");
        } else {
            this.ingredients.add(ingredient);
        }
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", last_used=" + last_used +
                ", ingredients=" + ingredients +
                '}';
    }
}

package model.entities;

import model.entities.Ingredient;

import java.util.Date;
import java.util.Set;

public class Meal {

    private Long id;

    private String name;

    private String description;

    private Date last_used;

    private Set<Ingredient> ingredients;

    public Meal(Long id, String name, String description, Date last_used, Set<Ingredient> ingredients) {
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

    public Date getLast_used() {
        return last_used;
    }

    public void setLast_used(Date last_used) {
        this.last_used = last_used;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
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

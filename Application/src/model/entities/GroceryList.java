package model.entities;

import java.util.Set;

public class GroceryList {

    private String name;

    private Long numMeals;

    private Set<Meal> meals;

    public GroceryList() {
    }

    public GroceryList(String name, Long numMeals, Set<Meal> meals) {
        this.name = name;
        this.numMeals = numMeals;
        this.meals = meals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumMeals() {
        return numMeals;
    }

    public void setNumMeals(Long numMeals) {
        this.numMeals = numMeals;
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "name='" + name + '\'' +
                ", numMeals=" + numMeals +
                ", meals=" + meals +
                '}';
    }
}

package model.entities;

public class Ingredient {

    private Long ID;

    private String name;

    public Ingredient() {};

    public Ingredient(Long id, String name) {
        this.ID = id;
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}

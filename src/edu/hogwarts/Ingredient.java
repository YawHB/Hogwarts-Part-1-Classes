package edu.hogwarts;

public class Ingredient {

    private String name;
    private double amount;
    private String unit;


    public Ingredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}

package edu.hogwarts;

import java.util.Arrays;

public class House {

    private String name;
    private String founder;
    private String[] colors;


    public House() {
    }

    public House(String name, String founder, String[] colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return
                "name: '" + name + '\'' +
                ", founder: '" + founder + '\'' +
                ", colors: " + Arrays.toString(colors) +
                '}';
    }
}

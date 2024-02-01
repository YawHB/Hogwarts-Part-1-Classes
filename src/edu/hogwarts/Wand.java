package edu.hogwarts;

public class Wand {

    private double lengthInInches;
    private String wood;
    private String core;


    public Wand(double lengthInInches, String wood, String core) {
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    @Override
    public String toString() {
        return "Wand{" +
                "lengthInInches=" + lengthInInches +
                ", wood='" + wood + '\'' +
                ", core='" + core + '\'' +
                '}';
    }
}

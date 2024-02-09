package edu.hogwarts.data;

import edu.generic.Student;

import java.util.Arrays;

public class HogwartsStudent extends Student {
    private int id;
    private String house;
    private boolean prefect;
    private String[] teams;

    //1. Opret en liste af elever fra Harry Potters årgang - brug fx disse links (se opgavebeskrivelsen)


    public HogwartsStudent() {
    }

    //copy constructor
    public HogwartsStudent(HogwartsStudent other) {
        this.id = other.id;
        this.house = other.house;
        this.prefect = other.prefect;
        this.teams = other.teams;

    }

    public HogwartsStudent(String house, boolean prefect, String[] teams) {
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return
                "house='" + house + '\'' +
                        ", prefect=" + prefect +
                        ", teams=" + Arrays.toString(teams) +
                        "} " + super.toString();
    }
}

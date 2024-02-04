package edu.hogwarts;

import java.util.Arrays;

public class HogwartsStudent extends Student {

    private String house;
    private boolean prefect;
    private String[] teams;

   //1. Opret en liste af elever fra Harry Potters årgang - brug fx disse links (se opgavebeskrivelsen)




    public HogwartsStudent() {
    }

    public HogwartsStudent(String house, boolean prefect, String[] teams) {
        this.house = house;
        this.prefect = prefect;
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

package edu.hogwarts;

import java.util.Date;

public class HogwartsTeacher extends Teacher {

    private House house;
    private boolean headOfHouse;

    //1. Opret Horace Slughorn og Severus Snape
    public HogwartsTeacher() {
    }

    public HogwartsTeacher(House house, boolean headOfHouse) {
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    @Override
    public String toString() {
        return "HogwartsTeacher{" +
                "house=" + house +
                ", headOfHouse=" + headOfHouse +
                "} " + super.toString();
    }
}

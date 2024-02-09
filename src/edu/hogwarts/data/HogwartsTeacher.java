package edu.hogwarts.data;

import edu.generic.Teacher;

import java.util.Date;

public class HogwartsTeacher extends Teacher {
    private int id;
    private House house;
    private boolean headOfHouse;

    //1. Opret Horace Slughorn og Severus Snape




    public HogwartsTeacher(HogwartsTeacher other) {
        this.id = other.id;
        this.house = other.house;
        this.headOfHouse = other.headOfHouse;

    }

    public HogwartsTeacher(String firstName, String lastName, String middleName, String employment, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(firstName, lastName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    @Override
    public String toString() {
        return
                "house: " + house +
                        ", headOfHouse=" + headOfHouse +
                        "} " + super.toString();
    }
}

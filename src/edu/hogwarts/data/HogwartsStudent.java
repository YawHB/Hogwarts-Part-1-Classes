package edu.hogwarts.data;

import edu.generic.Student;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class HogwartsStudent extends Student implements Comparable<HogwartsStudent> {
    private int id;
    private House house;
    private boolean prefect;
    private String[] teams;



    public HogwartsStudent() {
    }

    //copy constructor
    public HogwartsStudent(HogwartsStudent other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.middleName = other.middleName;
        this.enrollmentYear = other.enrollmentYear;
        this.graduationYear = other.graduationYear;
        this.graduated = other.graduated;
        this.id = other.id;
        this.house = other.house;
        this.prefect = other.prefect;
        this.teams = other.teams;
    }

    public HogwartsStudent(String firstName, String lastName, String middleName, int enrollmentYear, int graduationYear, boolean graduated, int id, House house, boolean prefect, String[] teams) {
        super(firstName, lastName, middleName, enrollmentYear, graduationYear, graduated);
        this.id = id;
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(House house, boolean prefect, String[] teams) {
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

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
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
        return  super.toString() +
                "id " + id +
                ", house " + house +
                ", prefect " + prefect +
                ", teams " + Arrays.toString(teams) +
                ", firstName " + firstName + '\'' +
                ", lastName " + lastName + '\'' +
                ", middleName " + middleName + '\'';
    }

 /*   @Override
    public String toString() {
        return "HogwartsStudent{" +
                super.toString() +
                "id=" + id +
                ", house=" + house +
                ", prefect=" + prefect +
                ", teams=" + Arrays.toString(teams) +
                "}";
    }*/

    @Override
    public int compareTo(@NotNull HogwartsStudent o) {

        return this.getFirstName().compareTo(o.getFirstName());
    }
}

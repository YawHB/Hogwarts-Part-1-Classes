package edu.hogwarts;

import java.util.Date;

public class HogwartsTeacher extends Teacher {

    private House house;
    private boolean headOfHouse;

    //1. Opret Horace Slughorn og Severus Snape


  public HogwartsTeacher(String firstName, String lastName, String middleName ,String employment, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
      super(firstName, lastName, middleName, employment, employmentStart, employmentEnd);
      this.house = house;
      this.headOfHouse = headOfHouse;

  }



    /* public HogwartsTeacher(Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }*/

    @Override
    public String toString() {
        return
                "house: " + house +
                ", headOfHouse=" + headOfHouse +
                "} " + super.toString();
    }
}

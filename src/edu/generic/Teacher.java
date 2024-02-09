package edu.generic;

import java.util.Date;

public class Teacher extends Person {

    private String employment;

    private Date employmentStart;

    private Date employmentEnd;

    public Teacher() {
    }



  public Teacher(String firstName, String lastName, String middleName, String employment, Date employmentStart, Date employmentEnd){
        super(firstName, lastName, middleName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
  }

    @Override
    public String toString() {
        return "Teacher Klasse{" +

                "employment: " + employment +
                "employmentStart: " + employmentStart +
                ", employmentEnd: " + employmentEnd +
                '}' + super.toString();
    }
}

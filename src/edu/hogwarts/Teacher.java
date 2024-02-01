package edu.hogwarts;

import java.util.Date;

public class Teacher {

    //private empType employment;

    private Date employmentStart;

    private Date employmentEnd;

    public Teacher() {
    }

    public Teacher(Date employmentStart, Date employmentEnd) {
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employmentStart=" + employmentStart +
                ", employmentEnd=" + employmentEnd +
                '}';
    }
}

package edu.generic;

public class Student extends Person {

    protected int enrollmentYear;
    protected int graduationYear;
    protected boolean graduated;


    public Student() {

    }



    public Student(String firstName, String lastName, String middleName, int enrollmentYear, int graduationYear, boolean graduated) {
        super( firstName, lastName, middleName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return   super.toString() +
                " enrollmentYear " + enrollmentYear +
                ", graduationYear " + graduationYear +
                ", graduated " + graduated + " || "
                 ;
    }
}

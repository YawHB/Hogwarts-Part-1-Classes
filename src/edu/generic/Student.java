package edu.generic;

public class Student extends Person {

    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;


    public Student() {

    }



    public Student(int enrollmentYear, int graduationYear, boolean graduated) {
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return  "enrollmentYear=" + enrollmentYear + ", graduationYear=" + graduationYear + ", graduated=" + graduated + '\n';
    }
}

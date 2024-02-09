package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;

import java.util.Arrays;

public class Course {
    private Subject subject;

    private Teacher teacher;
    private Student[] students;
    //private TeachingMaterial[] materials;

    //1. Opret potions sixth year med Slughorn og ikke mere end 12 elever.


    public Course(Subject subject, Teacher teacher, Student[] students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}

package edu.hogwarts.controllers;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsStudent;

import java.util.*;

public class StudentController {

    private int lastID = 1;
    private final Map<Integer, HogwartsStudent> studentMap = new HashMap();

    public void createStudent(HogwartsStudent student) {

        var hwStudent = new HogwartsStudent(student);
        hwStudent.setId(lastID);
        studentMap.put(lastID, hwStudent);

        this.lastID++;

    }


    public Student getStudent(int id) {
        return studentMap.get(id);
    }

    public List<HogwartsStudent> getAllStudents() {
        return studentMap.values().stream().toList();

    }

    public List<HogwartsStudent> getAllStudentsSorted(Comparator<HogwartsStudent> sortBy) {
        List list = new ArrayList<>(studentMap.values());
        list.sort(sortBy);
        return list;

    } public Boolean getAllStudentsSorted(boolean bool) {
        return true;

    }

    public void updateStudent(int id, HogwartsStudent newStudent) {
        var hwStudent = new HogwartsStudent(newStudent);
        studentMap.put(id, hwStudent);
    }

    public void deleteStudent(int id, HogwartsStudent studentToDelete) {
        studentMap.remove(id);
    }
}

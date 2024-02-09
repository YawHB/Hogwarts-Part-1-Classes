package edu.hogwarts.controllers;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsStudent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void updateStudent(int id, HogwartsStudent newStudent) {
        var hwStudent = new HogwartsStudent(newStudent);
        studentMap.put(id, hwStudent);
    }

    public void deleteStudent(int id, HogwartsStudent studentToDelete) {
        studentMap.remove(id);
    }
}

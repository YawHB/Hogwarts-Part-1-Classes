package edu.hogwarts.controllers;

import edu.hogwarts.data.HogwartsTeacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherController {
    private int lastID = 1;
    private final Map<Integer, HogwartsTeacher> teacherMap = new HashMap<>();


    public void createTeacher(HogwartsTeacher newTeacher) {
       newTeacher.setId(lastID);
        teacherMap.put(lastID, newTeacher);
        lastID++;
    }

    public HogwartsTeacher getTeacher(int id) {
        return teacherMap.get(id);
    }

    public List<HogwartsTeacher> getAllTeachers() {
        return teacherMap.values().stream().toList();
    }

    public void updateTeacher(int id, HogwartsTeacher newTeacher) {
        var hwTeacher = new HogwartsTeacher(newTeacher);
        teacherMap.put(id, hwTeacher);
    }

    public void deleteTeacher(int id, HogwartsTeacher teacherToDelete) {
        teacherMap.remove(id);
    }
}

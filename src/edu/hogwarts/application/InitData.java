package edu.hogwarts.application;

import edu.hogwarts.controllers.StudentController;
import edu.hogwarts.controllers.TeacherController;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class InitData {

    public void initData() {

        //**************************House objects*****************************//
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"Red og Gold"});
        House slytherin = new House("Slytherin", "Bubber", new String[]{"Black", "Blue"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blå", "Bronze"});
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Gul", "Sort"});




        //**************************HogwartsStudents objects*****************************//


        HogwartsStudent harryPotter = new HogwartsStudent("Harry", "Potter", "James", 1991, 1998, true, 1, gryffindor, true, new String[]{"Quidditch", "Dumbledore's Army"});
        HogwartsStudent hermioneGranger = new HogwartsStudent("Hermione", "Granger", "Jean", 1991, 1998, true, 2, gryffindor, true, new String[]{"S.P.E.W", "Dumbledore's Army"});
        HogwartsStudent ronWeasley = new HogwartsStudent("Ron", "Weasley", "Bilius", 1991, 1998, true, 3, gryffindor, false, new String[]{"Wizard Chess", "Dumbledore's Army"});
        HogwartsStudent dracoMalfoy = new HogwartsStudent("Draco", "Malfoy", "Lucius", 1991, 1998, true, 4, gryffindor, false, new String[]{"Inquisitorial Squad"});
        HogwartsStudent lunaLovegood = new HogwartsStudent("Luna", "Lovegood", "Xenophilius", 1992, 1999, false, 5, gryffindor, false, new String[]{"Quibbler Support Team"});
        var lunaLovegood2 = new HogwartsStudent("Luna", "love", "null", 180, 1990, true, 111, gryffindor, true, new String[]{"Wizard Chess", "Dumbledore's Army"});

        StudentController studentController = new StudentController();
        studentController.createStudent(harryPotter);
        studentController.createStudent(hermioneGranger);
        studentController.createStudent(ronWeasley);
        studentController.createStudent(dracoMalfoy);
        studentController.createStudent(lunaLovegood);
        studentController.createStudent(lunaLovegood2);

        //Kalder getAllStudents og lagrer dem i at ArrayList, da retur-værdien er immutable
        //Nu er alle students i en ArrayList(som er mutable). Derfor kan vi nu sortere i dem.
         List<HogwartsStudent> students = new ArrayList<>(studentController.getAllStudents());
         for (HogwartsStudent student : students) {
             System.out.println(student);
         }
        System.out.println("----------------------------------------");
        System.out.println("--------------SORTED LIST-------------------");

         Collections.sort(students);
         for (HogwartsStudent student: students) {
             System.out.println(student);
         }








        //**************************HogwartsTeachers objects*****************************//
        HogwartsTeacher horace = new HogwartsTeacher("Horace", "Slughorn", null, "Potions Master", new Date(), new Date(), slytherin, false);
        HogwartsTeacher minerva = new HogwartsTeacher("Minerva", "McGonagall", null, "Transfiguration Professor", new Date(), new Date(), gryffindor, true);
        HogwartsTeacher severus = new HogwartsTeacher("Severus", "Snape", null, "Potions Master", new Date(), new Date(), slytherin, false);
        HogwartsTeacher filius = new HogwartsTeacher("Filius", "Flitwick", null, "Charms Professor", new Date(), new Date(), ravenclaw, false);
        HogwartsTeacher pomona = new HogwartsTeacher("Pomona", "Sprout", null, "Herbology Professor", new Date(), new Date(), hufflepuff, false);

        TeacherController hwTeacher = new TeacherController();

        hwTeacher.createTeacher(horace);
        hwTeacher.createTeacher(minerva);
        hwTeacher.createTeacher(severus);
        hwTeacher.createTeacher(filius);
        hwTeacher.createTeacher(pomona);



    }
}

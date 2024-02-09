package edu.hogwarts.application;

import edu.hogwarts.controllers.StudentController;
import edu.hogwarts.controllers.TeacherController;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.util.Date;

public class InitData {

    public void initData() {


        //**************************HogwartsStudents bjects*****************************//
        var harryPotter = new HogwartsStudent("Gryffindor", true, new String[]{"Quidditch", "Dumbledore's Army"});
        var hermioneGranger = new HogwartsStudent("Gryffindor", true, new String[]{"S.P.E.W", "Dumbledore's Army"});
        var ronWeasley = new HogwartsStudent("Gryffindor", false, new String[]{"Wizard Chess", "Dumbledore's Army"});
        var dracoMalfoy = new HogwartsStudent("Slytherin", false, new String[]{"Inquisitorial Squad"});
        var lunaLovegood = new HogwartsStudent("Ravenclaw", false, new String[]{"Quibbler Support Team"});



        //**************************House objects*****************************//
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"Red og Gold"});
        House slytherin = new House("Slytherin", "Bubber", new String[]{"Black", "Blue"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blå", "Bronze"});
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Gul", "Sort"});


        StudentController studentController = new StudentController();
        studentController.createStudent(harryPotter);
        studentController.createStudent(hermioneGranger);
        studentController.createStudent(ronWeasley);
        studentController.createStudent(dracoMalfoy);
        studentController.createStudent(lunaLovegood);

        System.out.println(studentController.getAllStudents());


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

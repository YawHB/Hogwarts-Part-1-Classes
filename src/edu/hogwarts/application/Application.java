package edu.hogwarts.application;

import edu.hogwarts.data.DynamicArray;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();
        app.start();
    }
    private void start() {

        DynamicArray darr = new DynamicArray();

        //HogwartsStudents objects
        var harryPotter = new HogwartsStudent("Gryffindor", true, new String[]{"Quidditch", "Dumbledore's Army"});
        var hermioneGranger = new HogwartsStudent("Gryffindor", true, new String[]{"S.P.E.W", "Dumbledore's Army"});
        var ronWeasley = new HogwartsStudent("Gryffindor", false, new String[]{"Wizard Chess", "Dumbledore's Army"});
        var dracoMalfoy = new HogwartsStudent("Slytherin", false, new String[]{"Inquisitorial Squad"});
        var lunaLovegood = new HogwartsStudent("Ravenclaw", false, new String[]{"Quibbler Support Team"});

        darr.add(harryPotter);
        System.out.println(darr.getSize());

        //House objects
        var slytherin = new House("Slytherin", "Bubber", new String[]{"black", "blue"});


        //HogwartsTeachers objects
        var horace = new HogwartsTeacher("Horace", "Slughorn", null, "Potions Master", new Date(), new Date(), slytherin, false);



      /*  darr.add(harryPotter);
        darr.add(hermioneGranger);
        darr.add(ronWeasley);*/
        //System.out.println(darr);

        System.out.println(horace);
    }


}

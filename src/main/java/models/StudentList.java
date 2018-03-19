package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

    private static List<String> names;

    public static String getRandomName() {
        names = new ArrayList<>();
        names.add("Angus");
        names.add("Chris");
        names.add("Christie");
        names.add("Danny Sr");
        names.add("Danny Jr");
        names.add("Debbie");
        names.add("Ed");
        names.add("Ellie");
        names.add("Emma");
        names.add("Graeme");
        names.add("J");
        names.add("Jean");
        names.add("Jim");
        names.add("Paul");
        names.add("Ria");
        names.add("Sarah");
        names.add("Steven");
        names.add("Victor");
        Collections.shuffle(names);
        return names.get(0);
    }

    public static List<String> getRandomTwoNames() {
        List<String> chosen = new ArrayList<>();
        Collections.shuffle(names);
        chosen.add(names.get(0));
        chosen.add(names.get(1));
        return chosen;
    }

    public static List<String> getRandomThreeNames() {
        Collections.shuffle(names);
        List<String> chosen = new ArrayList<>();
        chosen.add(names.get(0));
        chosen.add(names.get(1));
        chosen.add(names.get(2));
        return chosen;
    }



}

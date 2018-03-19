package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

    private List<String> names;

    public StudentList() {
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
    }

    public static String getRandomName() {
        Collections.shuffle(names);
        return names.get(0);
    }

    public static List<String> getRandomTwoNames() {
        List<String> picked = new ArrayList<>();
        String name1 = getRandomName();
        String name2 = getRandomName();
        picked.add(name1);
        while (picked.contains(name2)) {
            name2 = getRandomName();
        }
        picked.add(name2);

        return picked;
    }

    public static List<String> getRandomThreeNames() {
        List<String> picked = new ArrayList<>();
        String name1 = getRandomName();
        String name2 = getRandomName();
        String name3 = getRandomName();
        picked.add(name1);
        while (picked.contains(name2)) {
            name2 = getRandomName();
        }
        picked.add(name2);
        while (picked.contains(name3)) {
            name3 = getRandomName();
        }
        picked.add(name3);

        return picked;
    }



}

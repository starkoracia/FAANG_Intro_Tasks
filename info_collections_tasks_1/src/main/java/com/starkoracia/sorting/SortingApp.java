package com.starkoracia.sorting;

import com.starkoracia.sorting.comparator.StudentFacultyComparator;
import com.starkoracia.sorting.comparator.StudentNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {

    private static final List<Student> students = new ArrayList<>();

    public static void main(String[]args) {
        students.add(new Student("Denys", 32, "Ar", new String[]{"1", "2", "3"}));
        students.add(new Student("Denys2", 12, "Tn", new String[]{"1", "2", "3"}));
        students.add(new Student("Uenys3", 52, "Om", new String[]{"1", "2", "3"}));
        students.add(new Student("Denys4", 42, "Tu", new String[]{"1", "2", "3"}));
        students.add(new Student("Aenys5", 22, "De", new String[]{"1", "2", "3"}));
        students.add(new Student("Denys6", 62, "Ar", new String[]{"1", "2", "3"}));
        students.add(new Student("Denys7", 72, "Fac1", new String[]{"1", "2", "3"}));

        Collections.sort(students);
        students.forEach(System.out::println);
        System.out.println();
        Collections.sort(students, new StudentNameComparator());
        students.forEach(System.out::println);
        System.out.println();
        Collections.sort(students, new StudentFacultyComparator());
        students.forEach(System.out::println);
        System.out.println();

    }

}
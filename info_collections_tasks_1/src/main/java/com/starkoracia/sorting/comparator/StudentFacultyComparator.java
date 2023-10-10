package com.starkoracia.sorting.comparator;

import com.starkoracia.sorting.Student;

import java.util.Comparator;

public class StudentFacultyComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student2.getFaculty().compareTo(student1.getFaculty());
    }

}

package com.starkoracia.sorting;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    int age;
    String faculty;
    String[] abilities;

    public Student(String name, int age, String faculty, String[] abilities) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty) && Arrays.equals(abilities, student.abilities);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, faculty);
        result = 31 * result + Arrays.hashCode(abilities);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", abilities=" + Arrays.toString(abilities) +
                "}";
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getAge(), student.getAge());
    }

}

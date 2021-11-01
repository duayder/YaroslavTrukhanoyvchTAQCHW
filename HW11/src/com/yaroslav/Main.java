package com.yaroslav;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Petro", 1));
        students.add(new Student("Andriy", 1));
        students.add(new Student("Viktor", 2));
        students.add(new Student("Dmytro", 3));
        students.add(new Student("Petro", 4));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareByName(o2);
            }
        });
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareByCourse(o2);
            }
        });
        System.out.println(students);
    }
}

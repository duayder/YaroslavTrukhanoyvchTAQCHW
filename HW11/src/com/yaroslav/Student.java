package com.yaroslav;

import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course){
        for(Student student: students)
        {
            if(student.getCourse() == course){
                System.out.println("Student`s name is " + student.getName());
            }
        }
    }

    public int compareByName(Student student){
        return name.compareTo(student.getName());
    }

    public int compareByCourse(Student student){
        return Integer.compare(student.getCourse(), course);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCourse(){
        return this.course;
    }

    public void setCourse(int course){
        this.course = course;
    }

    @Override
    public String toString(){
        return (name + "-" + course);
    }
}

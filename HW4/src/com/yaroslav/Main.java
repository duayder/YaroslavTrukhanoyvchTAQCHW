package com.yaroslav;

public class Main {

    public static void main(String[] args) {
        Person student1 = new Person("Dmytro", 1998);
        student1.inputInfo();
        student1.outputInfo();

        Person student2 = new Person("Oleh", 1998);
        student2.inputInfo();
        student2.outputInfo();

        Person student3 = new Person("Andriy", 1999);
        student3.inputInfo();
        student3.outputInfo();

        Person student4 = new Person("Olga", 1999);
        student4.inputInfo();
        student4.outputInfo();

        Person student5 = new Person("Olga", 1999);
        student5.inputInfo();
        student5.outputInfo();
        student5.changeName();
        student5.outputInfo();
    }
}

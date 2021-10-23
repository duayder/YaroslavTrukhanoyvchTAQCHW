package com.yaroslav;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int birthYear;

    private int age;

    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person ()
    {

    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBirthYear()
    {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    public int calculateAge()
    {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public void inputInfo()
    {
        String name = this.getName();
        int birthYear = this.getBirthYear();
    }

    public void outputInfo()
    {
        age = this.calculateAge();

        System.out.println("Student`s name is " + name);
        System.out.println("Student`s birthyear is " + birthYear);
        System.out.println("Student`s age is " + age);
    }

    public void changeName()
    {
        System.out.println("Enter a new name: ");
        String newName = sc.nextLine();
        this.setName(newName);
    }
}

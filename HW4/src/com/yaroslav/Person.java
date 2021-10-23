package com.yaroslav;
import java.time.YearMonth;

public class Person {
    private String name;
    private int birthYear;

    private int age;

    int currentYear = YearMonth.now().getYear();

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

    public int calculateAge(int age)
    {
        age = currentYear - birthYear;
        return age;
    }

    public void Input()
    {
        String name = this.getName();
        int birthYear = this.getBirthYear();
    }

    public void Output()
    {
        System.out.println("Person`s name is " + name);
        System.out.println("Person`s birthyear is " + birthYear);
    }
}

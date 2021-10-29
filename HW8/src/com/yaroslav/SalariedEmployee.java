package com.yaroslav;

public class SalariedEmployee extends Employee implements Calculation{
    private String socialSecurityNumber;
    private String name = getName();
    private String employeeid = getEmployeeid();
    private int hoursWorked;
    private int hourlyWage;

    public SalariedEmployee (String name, String employeeid, String socialSecurityNumber, int hoursWorked, int hourlyWage)
    {
        this.name = name;
        this.employeeid = employeeid;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public int calculatePay(){
        int salary = getSalary();
        salary = hoursWorked * hourlyWage;
        return salary;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorkedy(){
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWage() {
        return this.hourlyWage;
    }

    public void setHourlyWage(){
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString()
    {
        return name + " is a salaried employee. " +
                "\nThe employee`s id is " + employeeid +
                "\nThe employee`s social security number is " + socialSecurityNumber +
                "\nThe employee worked for " + hoursWorked + " hours and received " + hourlyWage + " USD per hour" +
                "\nThe employee`s salary is " + calculatePay();
    }
}

package com.yaroslav;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private int hoursWorked;
    private int hourlyWage;

    public SalariedEmployee (String name, String employeeid, String socialSecurityNumber, int hoursWorked, int hourlyWage)
    {
        super(name, employeeid);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public int calculatePay(){
        return hoursWorked * hourlyWage;
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
        return getName() + " is a salaried employee. " +
                "\nThe employee`s id is " + getEmployeeid() +
                "\nThe employee`s social security number is " + socialSecurityNumber +
                "\nThe employee worked for " + hoursWorked + " hours and received " + hourlyWage + " USD per hour" +
                "\nThe employee`s salary is " + calculatePay();
    }
}

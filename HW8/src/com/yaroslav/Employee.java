package com.yaroslav;

public abstract class Employee implements Calculation{
    private String employeeid;
    private String name;

    public Employee(String name, String employeeid){
        this.name = name;
        this.employeeid = employeeid;
    }

    public String getEmployeeid() {
        return this.employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

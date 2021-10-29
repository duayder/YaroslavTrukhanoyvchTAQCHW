package com.yaroslav;

public class ContractEmployee extends Employee implements Calculation{
    private String federalTaxIdMember;
    private String name = getName();
    private String employeeid = getEmployeeid();
    private int fixedPayment;

    ContractEmployee(String name, String employeeid, String federalTaxIdMember, int fixedPayment){
        this.name = name;
        this.employeeid = employeeid;
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedPayment = fixedPayment;
    }

    public int calculatePay(){
        int salary = getSalary();
        salary = fixedPayment;
        return salary;
    }

    public String getFederalTaxIdMember() {
        return this.federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getFixedPayment() {
        return this.fixedPayment;
    }

    public void setFixedPaymente(){
        this.fixedPayment = fixedPayment;
    }

    @Override
    public String toString()
    {
        return name + " is a contract employee. " +
                "\nThe employee`s id is " + employeeid +
                "\nThe employee`s federal tax member id is " + federalTaxIdMember +
                "\nThe employee`s fixed payment is " + fixedPayment +
                "\nThe employee`s salary is " + calculatePay();
    }
}

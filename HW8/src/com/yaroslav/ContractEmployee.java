package com.yaroslav;

public class ContractEmployee extends Employee{
    private String federalTaxIdMember;
    private int fixedPayment;

    ContractEmployee(String name, String employeeid, String federalTaxIdMember, int fixedPayment){
        super(name, employeeid);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedPayment = fixedPayment;
    }

    public int calculatePay(){
        return fixedPayment;
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
        return getName() + " is a contract employee. " +
                "\nThe employee`s id is " + getEmployeeid() +
                "\nThe employee`s federal tax member id is " + federalTaxIdMember +
                "\nThe employee`s fixed payment is " + fixedPayment +
                "\nThe employee`s salary is " + calculatePay();
    }
}

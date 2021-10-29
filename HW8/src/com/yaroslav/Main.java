package com.yaroslav;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("John", "1", "1234", 40, 15));
        employees.add(new SalariedEmployee("Jack", "2", "1123", 35, 12));
        employees.add(new ContractEmployee("Anna", "3", "112", 450));
        employees.add(new ContractEmployee("Ace", "4", "113", 300));

        employees.sort(Comparator.comparingInt(Employee::getSalary).reversed());

        System.out.println(employees);
    }
}

package com.aweperi.abstraction_and_encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        var employee1 = new Employee(500_000);
        System.out.println(employee1.calculateWage());
        Employee.printNumberOfEmployees();
    }

}

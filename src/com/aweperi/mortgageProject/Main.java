package com.aweperi.mortgageProject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the mortgage calculator");
        int principal = (int) Console.readNumber("Principal ($1K - $1M)", 1000, 1_000_000);
        float annualRate = (float) Console.readNumber("Annual Interest Rate", 0, 30);
        byte years = (byte) Console.readNumber("Period (Years)", 0, 30);

        var mortgageCalculator = new MortgageCalculator(principal, annualRate, years);
        var report = new MortgageReport(mortgageCalculator);
        report.printMortgage();
        System.out.println();
        report.printPaymentSchedule();
    }
}
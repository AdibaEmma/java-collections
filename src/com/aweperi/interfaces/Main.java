package com.aweperi.interfaces;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculatorImpl(10_000);
        var report = new TaxReport();
        report.show(calculator);

//        report.setCalculator(new TaxCalculatorImpl2());
        report.show(new TaxCalculatorImpl2());

    }

}

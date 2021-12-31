package com.aweperi.interfaces;

public class TaxReport {
    private TaxCalculatorImpl calculator;

    public TaxReport() {
        calculator = new TaxCalculatorImpl(1_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}

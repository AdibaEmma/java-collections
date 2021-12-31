package com.aweperi.interfaces;

public class TaxCalculatorImpl implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculatorImpl(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.4;
    }
}

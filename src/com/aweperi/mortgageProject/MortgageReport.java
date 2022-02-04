package com.aweperi.mortgageProject;

import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currency;
    private final MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("MORTGAGE \n________");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println("LOAN BALANCE \n ___________");

        for(double balance : mortgageCalculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }
}

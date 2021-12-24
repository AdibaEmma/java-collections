package project1;

import java.text.NumberFormat;

import static java.lang.Math.pow;

/**
 *
 */
public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private final int principal;
    private final float annualRate;
    private final byte years;

    public MortgageCalculator(int principal, float annualRate, byte years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();
        return principal * (monthlyInterest * pow((1 + monthlyInterest), numberOfPayments) / (pow((1 + monthlyInterest), numberOfPayments) - 1));
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getInterest();
        short numberOfPayments = getNumberOfPayments();
        return principal * (pow(1 + monthlyInterest, numberOfPayments) - pow(1 + monthlyInterest, numberOfPaymentsMade)) / (pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }
    private float getMonthlyInterest() {
        return annualRate / PERCENT / MONTHS_IN_YEAR;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getInterest() {
        return annualRate / PERCENT / MONTHS_IN_YEAR;
    }

}

package project1;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
    }
    public void printPaymentSchedule() {
        System.out.println("LOAN BALANCE \n ___________");

        for(double balance : mortgageCalculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }

    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE \n________");
        System.out.println("Monthly Payments: " + mortgageFormatted);
        System.out.println("Total Payment: " + mortgageFormatted);
    }
}

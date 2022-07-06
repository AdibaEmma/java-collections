package com.aweperi.design_patterns.template;

public class Main {
    public static void main(String[] args) {
        var transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();
        var generateReport = new GenerateReport();
        generateReport.execute();
    }
}

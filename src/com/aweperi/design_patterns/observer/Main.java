package com.aweperi.design_patterns.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadsheet1 = new Spreadsheet(dataSource);
        var spreadsheet2 = new Spreadsheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(spreadsheet1);
        dataSource.addObserver(spreadsheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}

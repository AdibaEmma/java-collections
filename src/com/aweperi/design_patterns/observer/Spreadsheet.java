package com.aweperi.design_patterns.observer;

public class Spreadsheet implements Observer {
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified: " + dataSource.getValue());
    }
}

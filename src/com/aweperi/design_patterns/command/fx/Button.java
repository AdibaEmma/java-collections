package com.aweperi.design_patterns.command.fx;

public class Button {
    private String label;
    private final Command command;

    public Button(String label, Command command) {
        this.label = label;
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

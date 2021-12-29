package com.aweperi.inheritance;

public class TextBox extends UIControl {
    public String text;

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String toString() {
        return  text;
    }
}

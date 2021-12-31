package com.aweperi.abstraction_and_encapsulation;

public class TextBox {
    public String text;

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}

package com.aweperi.oop;

import com.aweperi.inheritance.UIControl;

public class TextBox {
    public String text;

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}

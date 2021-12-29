package com.aweperi.inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textbox = new TextBox();
//        control.toggle();
//        System.out.println(control.isEnabled());
//        control.toggle();
//        System.out.println(control.isEnabled());
//
//        var control2 = control;
//        System.out.println(control2.equals(control));
//        System.out.println(control2.hashCode() == control.hashCode());
        show(textbox);
    }

    public static void show(UIControl control) {
        if(control instanceof TextBox) {
            var textbox = (TextBox) control;
            textbox.setText("Hello World");
        }
        System.out.println(control);
    }
}

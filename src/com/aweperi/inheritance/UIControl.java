package com.aweperi.inheritance;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        System.out.println("UIControl");
    }

    public void toggle() {
        isEnabled = !isEnabled;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void render() {
    }
}

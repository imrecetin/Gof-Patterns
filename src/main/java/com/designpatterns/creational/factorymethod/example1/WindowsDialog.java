package com.designpatterns.creational.factorymethod.example1;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

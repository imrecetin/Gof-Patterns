package com.designpatterns.creational.factorymethod.example1;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Test Windows Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World From windows!'");
    }
}

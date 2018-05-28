package com.designpatterns.creational.factorymethod.example1;

public abstract class Dialog {
    
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}


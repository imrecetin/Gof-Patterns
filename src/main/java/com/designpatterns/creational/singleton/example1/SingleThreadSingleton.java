package com.designpatterns.creational.singleton.example1;

public final class SingleThreadSingleton {
    
    private static SingleThreadSingleton instance;
    public String value;

    private SingleThreadSingleton(String value) {
        // Following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingleThreadSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SingleThreadSingleton(value);
        }
        return instance;
    }
}

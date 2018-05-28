package com.designpatterns.creational.singleton.example1;

public final class MultiThreadSingleton {
    
    private static volatile MultiThreadSingleton instance;
    public String value;

    private MultiThreadSingleton(String value) {
        this.value = value;
    }

    public static MultiThreadSingleton getInstance(String value) {
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton(value);
                }
            }
        }
        return instance;
    }
}

package com.designpatterns.creational.singleton.example1;

public class SingleThreadClient {
    public static void main(String[] args) {
        SingleThreadSingleton singleton = SingleThreadSingleton.getInstance("FOO");
        SingleThreadSingleton anotherSingleton = SingleThreadSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

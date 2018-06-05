package com.designpatterns.behavioral.observer.example1;

import java.io.File;

public interface EventListener {
    
    public void update(String eventType, File file);
}

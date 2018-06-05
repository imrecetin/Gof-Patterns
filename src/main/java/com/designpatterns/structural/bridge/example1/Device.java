package com.designpatterns.structural.bridge.example1;

public interface Device {
    
    public boolean isEnabled();

    public void enable();

    public void disable();

    public int getVolume();

    public void setVolume(int percent);

    public int getChannel();

    public void setChannel(int channel);

    public void printStatus();
    
}

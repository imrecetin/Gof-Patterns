package com.designpatterns.creational.builder.example1;

public interface Builder {
    
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
    
    public enum Type {
        CITY_CAR, SPORTS_CAR, SUV;
    }
    
    public enum Transmission {
        SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC;
    }
    
}

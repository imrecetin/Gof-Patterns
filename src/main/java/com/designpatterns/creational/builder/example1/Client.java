package com.designpatterns.creational.builder.example1;

public class Client {
    /*
     * Identification: The Builder pattern can be recognized in class, 
     * which has a single creational method and several methods to configure the resulting object. 
     * Builder methods often support chaining (for example, someBuilder->setValueA(1)->setValueB(2)->create()).
     * 
     * */
    public static void main(String[] args) {
        
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());
        
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
        
    }
}

package com.designpatterns.creational.abstractfactory.example1;

public class IKEAFamilyFurniture extends FamilyFurnitureFactory {
    @Override
    public Chair createChair() {
        return new IKEAChair();
    }

    @Override
    public Sofa createSofa() {
        return new IKEASofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new IKEACoffeeTable();
    }
}

package com.designpatterns.creational.abstractfactory.example1;

public abstract class FamilyFurnitureFactory {
    
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract CoffeeTable createCoffeeTable();
    
    enum FamilyFurnitureType{
        IKEA,
        VICTORIANSTYLE,
        ARTDECO;
    }
    
    public static FamilyFurnitureFactory createFurnitureFamily(FamilyFurnitureType familyFurnitureType){
        switch (familyFurnitureType) {
            case IKEA:
                return new IKEAFamilyFurniture();
            case VICTORIANSTYLE:
                return new VictorianStyleFamilyFurniture();
            case ARTDECO:
                return new ArtDecoFamilyFurniture();
            default:
                return null;
        }
    }
}

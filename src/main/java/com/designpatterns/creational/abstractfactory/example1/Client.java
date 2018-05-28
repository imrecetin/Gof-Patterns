package com.designpatterns.creational.abstractfactory.example1;

import com.designpatterns.creational.abstractfactory.example1.FamilyFurnitureFactory.FamilyFurnitureType;

public class Client {
    
    public static void main(String[] args) {
        
        FamilyFurnitureFactory ikeaFactory = FamilyFurnitureFactory.createFurnitureFamily(FamilyFurnitureType.IKEA);
        FamilyFurnitureFactory artDecoFactory = FamilyFurnitureFactory.createFurnitureFamily(FamilyFurnitureType.ARTDECO);
        
        Chair ikeaChair = ikeaFactory.createChair();
        CoffeeTable ikeaCoffeeTable = ikeaFactory.createCoffeeTable();
        
        Chair artDecoChair = artDecoFactory.createChair();
        CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable();
        
    }
}

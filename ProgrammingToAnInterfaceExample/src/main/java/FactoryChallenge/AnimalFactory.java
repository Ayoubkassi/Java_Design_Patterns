/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryChallenge;

/**
 *
 * @author ryota
 */
public abstract class AnimalFactory {
    
    //method getAnimal to create animal
    
    public abstract Animal getAnimalType(String type) throws Exception;
}


class ConcreteFactory extends AnimalFactory{

    @Override
    public Animal getAnimalType(String type) throws Exception {
        switch(type){      
                case "Duck" -> {
                    return new Duck();
            }
                case "Tiger" -> {
                    return new Tiger();
            }
                default -> throw new Exception("Animal Type "+ type+ "canno't be instantiated");
                    
        }
    }

}
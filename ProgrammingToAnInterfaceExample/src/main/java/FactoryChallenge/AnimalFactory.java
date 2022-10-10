/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryChallenge;

/**
 *
 * @author ryota
 */
public class AnimalFactory {
    
    //method getAnimal to create animal
    
    public static Animal getAnimal(String animalType){
        if(animalType == null)
            return null;
        else if(animalType.equalsIgnoreCase("Duck"))
            return new Duck();
        else if(animalType.equalsIgnoreCase("Tiger"))
            return new Tiger();
            
        return null;
    }
}

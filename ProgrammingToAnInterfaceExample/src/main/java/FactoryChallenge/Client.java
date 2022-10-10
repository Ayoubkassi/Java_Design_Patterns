/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryChallenge;

/**
 *
 * @author ryota
 */
public class Client {
    
    
    public static void main(String[] args) throws Exception{
        System.out.println("Hey Hey and welcome again");
        
        //craete object factory
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Animal animal1 = concreteFactory.getAnimalType("Duck");
        animal1.walk();
        
        
    }
}

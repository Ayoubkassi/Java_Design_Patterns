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
    
    
    public static void main(String[] args){
        System.out.println("Hey Hey and welcome again");
        
        Animal animal1 = AnimalFactory.getAnimal("Duck");
        animal1.walk();
    }
}

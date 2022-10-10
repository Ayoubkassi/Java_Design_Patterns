/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FactoryChallenge;

/**
 *
 * @author ryota
 */

//we wanna create an application that utilizes diferent type of animals (duck and tiger)
//your goal for this assignmentis to utilize the factory method design pattern for creation of each type of animal

// you should impment this pattern using the most common technique (using a class with a single factory method that takes a parameter to determine which object get created)

public interface Animal {
    void walk();
}

class Duck implements Animal{

    @Override
    public void walk() {
        System.out.println("Walk by Duck Pack Pack");
    }
    
}

class Tiger implements Animal{

    @Override
    public void walk() {
        System.out.println("Walk by Tiger Halum Halum");
    }
    
}

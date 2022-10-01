/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.raven.programmingtoaninterfaceexample;

/**
 *
 * @author ryota
 */

interface displayModule {
    
    public void display();
    
}

class Monitor implements displayModule {

    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
    
}

class Projector implements displayModule {

    @Override
    public void display() {
        System.out.println("Display throught Projector");
    }
    
}

public class Computer {
    displayModule dm;
    
    public void setDisplayModule(displayModule dm){
        this.dm = dm;
    }
    
    public void display(){
        dm.display();
    }
    
    public static void main(String[] args){

        Computer cm = new Computer();
        displayModule dm1 = new Monitor();
        displayModule dm2 = new Projector();
        
        //displayModule per each class
        cm.setDisplayModule(dm1);
        cm.display();
        //displayModule for second class
        cm.setDisplayModule(dm2);
        cm.display();
        
    }
    
    
} 
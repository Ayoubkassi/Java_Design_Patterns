/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FactoryCommonPattern;

/**
 *
 * @author ryota
 */
public interface Shape {
     void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square Draw Method");
    }   
    
}


class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle Draw Method");
    }   
    
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle Draw Method");
    }   
    
}
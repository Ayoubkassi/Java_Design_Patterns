/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryCommonPattern;

/**
 *
 * @author ryota
 */
public class Client {
    
    public static void main(String[] args){
        System.out.println("Hey hey and welcome again");
        
        Shape shape1 = ShapeFactory.getShape("Square");
        shape1.draw();
        
    }
}

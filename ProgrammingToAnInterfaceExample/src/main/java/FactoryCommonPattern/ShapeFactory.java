/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryCommonPattern;

/**
 *
 * @author ryota
 */
public class ShapeFactory {
    //This is creational pattern so we wanbna create object
    public static Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        return null;
    }
}

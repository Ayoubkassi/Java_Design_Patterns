/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openclosedprinciple;

/**
 *
 * @author ryota
 */

public interface Shape{
    public double calculateArea();
}

class Rectangle implements Shape{
    public double width;
    public double height;

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}

//class AreaCalculator{
//    public double calculateRectangleArea(Rectangle rectangle){
//        return rectangle.width * rectangle.height;
//    }
//    
//    public double calculateCircleArea(Circle circle){
//        return Math.PI * Math.pow(circle.radius, 2);
//    }
//}

class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);    
    }
}


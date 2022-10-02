/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceSegregation;

/**
 *
 * @author ryota
 */
public interface ShapeInterface {
    public double area();
}


interface SolidShapeInterface {
        public double volume();
}


interface ManageShapeInterface{
    public double calculate();
}
class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface{

    @Override
    public double area() {
        //calculate the area
        return 1.0;
    }

    @Override
    public double volume() {
        //calculate the volume 
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
    
}

class Square implements ShapeInterface, ManageShapeInterface{

    @Override
    public double area() {
        return 2.0;
    }
    
    @Override
    public double calculate() {
        return this.area();
    }
    
}

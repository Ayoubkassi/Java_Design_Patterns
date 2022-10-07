/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author ryota
 */
public abstract class AbstractShapeFactory {
    
    protected abstract Shape factoryMethod();
    
    public Shape getShape (){
        return factoryMethod();
    }
    
    //other helpers methods
    
}

class RectangleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
    
}

class SquareFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
    
}

class CircleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
    
}


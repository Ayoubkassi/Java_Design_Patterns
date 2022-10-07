/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author ryota
 */
public class Client {
    
    public static void main(String[] args){
        
        //get an object of circle and call its draw method
        
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();
        
        //
        
        Shape shape2 = new SquareFactory().getShape();
        
    }
}

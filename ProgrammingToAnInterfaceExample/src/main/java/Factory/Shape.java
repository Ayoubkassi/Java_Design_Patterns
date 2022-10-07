/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author ryota
 */

interface Shape{
    
     void draw();     
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle Draw Method");
    }
    
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle Draw Method");
    }
    
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square Draw Method");
    }
    
}







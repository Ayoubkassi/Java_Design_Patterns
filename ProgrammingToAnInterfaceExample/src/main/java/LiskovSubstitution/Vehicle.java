/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitution;

/**
 *
 * @author ryota
 */
public abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
    
    public void main(String[] args){
        
        Vehicle vehicle = new Bus();
        System.out.println(vehicle.getSpeed());
        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
    
}

class Car extends Vehicle{
    @Override
    int getSpeed(){ return 1; }
    @Override
    int getCubicCapacity(){ return 1; }
    boolean sHatchBack(){ return true; }
}

class Bus extends Vehicle{
    @Override
    int getSpeed(){ return 2; }
    @Override
    int getCubicCapacity(){ return 1; }
    String getEmergencyExitLoc(){ return "Emercency"; }
    
}


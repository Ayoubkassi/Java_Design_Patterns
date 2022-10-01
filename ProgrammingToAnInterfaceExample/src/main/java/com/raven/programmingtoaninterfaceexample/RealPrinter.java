/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.programmingtoaninterfaceexample;

/**
 *
 * @author ryota
 */
class RealPrinter {
    //the delegate
    void print(){
        System.out.println("The Delegate");
    }
    
}

class Printer{
    //the delegator
    RealPrinter p = new RealPrinter();
    
    //craete the delegate
    
    void print(){
        p.print(); //delegation
    }
    
}

class Tester{
    // To the outside world it looks like Printer actually prints
    
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print();
        
    }
}

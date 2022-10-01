/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.programmingtoaninterfaceexample;

import java.util.Date;

/**
 *
 * @author ryota
 */

public class Employee {
    private String Id;
    private String name;
    private String address;
    private Date dateOfJoining;
    
//    public boolean isPromotionDueThisYear(){
//        //promotion logic
//        return true;
//    }
    
//    public double calcIncomeTaxForCurrentYear(){
//        //income tax logic
//        return 1;
//    }
    
    //getters and setters for all member variables

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
    
}





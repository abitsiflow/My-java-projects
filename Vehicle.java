/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.abstraction;

/**
 *
 * @author ADMIN
 */
public abstract class Vehicle {
    
    abstract void sound();
    
    String brand;
    String model;
    int year;
    int door;
    
    Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        
    }
    
    @Override
    public String toString(){
        return "[" + this.model + " " + this.brand + " | " + this.year + " ]";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.abstraction;

/**
 *
 * @author ADMIN
 */
public class Motorcycle extends Vehicle{
    
    boolean sidecar;
    Motorcycle(String brand, String model, int year){
        super(brand, model, year);
        this.sidecar = false;
    }
    
    @Override
    void sound(){
        System.out.println("Sound: Braap!");
    }
    
    @Override
    public String toString() {
        return super.toString() + "[" + this.brand + " " + "|" + " " + this.year + "]" + " " + "Motorcycle(sidecar=" + this.sidecar + ")";
    }
    
}

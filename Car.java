/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.mavenproject28;

/**
 *
 * @author ADMIN
 */
public class Car extends CarSuper {
    int plateNumber;
    
    Car(String car, String model, int plateNumber){
        super(car, model);
        this.plateNumber = plateNumber;
    }
       
      void displayInfo(){
        System.out.println("You are Driving a " + this.car + " " + this.model);
          System.out.println("Platenumber: " + this.plateNumber);
    }
}

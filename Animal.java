/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.mavenproject28;

/**
 *
 * @author ADMIN
 */
public class Animal {
   String mammal;
   String reptile;
   
   Animal(String mammal, String reptile){
       this.mammal = mammal;
       this.reptile = reptile;
   }
   
    void displayInfo(){
        System.out.println("This animal is " + this.mammal);
        System.out.println("This animal is " + this.reptile);
    }
}

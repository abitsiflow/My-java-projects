/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.mavenproject22;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class GadgetClass {
    static Scanner scan = new Scanner(System.in);
    String gadgetName;
    double price;
    
    GadgetClass(String gadgetName, double price){
        this.gadgetName = gadgetName;
        this.price = price;
    }
    
    void gadgetPrint(){
        System.out.println("---------------------");
        System.out.println("Gadget: " + this.gadgetName);
        System.out.println("Price: " + "$" + this.price);
    }
   
}

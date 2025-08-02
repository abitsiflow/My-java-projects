/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject22;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gadget = null;
        double price;
        int choice;
        int put = 0;
        boolean running = true;
        GadgetClass[] object = null;
        while(running){
        System.out.println("*************************");
        System.out.println(" Gadget Inventory System");
        System.out.println("*************************");   
        System.out.println("1. Add");
        System.out.println("2. Show");
        System.out.println("3. Exit");
        choice = scan.nextInt();
  
        switch(choice){
            
            case 1 -> {
                System.out.println("How many you want to store Gadget? ");
                put = scan.nextInt();
                scan.nextLine();
                object = new GadgetClass[put]; // need this even you had array object just use object and put some variable inside bracket 
                for(int i = 0; i < put; i++){
                    System.out.println("Enter Gadget: ");
                    gadget = scan.nextLine();
                    System.out.println("");
                    System.out.println("Enter Price: ");
                    price = scan.nextDouble();
                    scan.nextLine();
                    object[i] = new GadgetClass(gadget,price);
                }
                
                 for(int i = 0; i < put; i++ ){
                     object[i].gadgetPrint();
                    }
            }
            case 2 -> {
                if(gadget == null){
                    System.out.println("No Items yet");
                }else{
                for(int i = 0; i < put; i++){
                    object[i].gadgetPrint();
                  }
               }
            }
            
            case 3 -> {
                running = false;
                System.out.println("Exiting....");
                }
            
            default -> System.out.println("Wrong input man");
            }
        }
    }
}

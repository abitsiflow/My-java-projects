/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject54;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject54 {
    static Scanner scan = new Scanner(System.in);
    static int num;  
    static int numbers[];
    static boolean isFound = false;
    
    public static void insert(){
        
        System.out.print("Enter how many num you want to put: ");
        num = scan.nextInt();
        scan.nextLine();
      
          numbers = new int[num];
      
      for(int i = 0; i < numbers.length; i++){
          numbers[i] = scan.nextInt();
          scan.nextLine();
      }
      
      for(int i = 0; i < numbers.length; i++){
          System.out.println(numbers[i]);
      }
   
    }
    
    public static void linearSearch(){
        int search;
      
        
            System.out.print("Enter what number do you want to search: ");
            search = scan.nextInt();
            scan.nextLine();
           
            for(int i = 0; i < numbers.length; i++){
                if(search == numbers[i]){
                   System.out.println("The " + search + " is found!");
                   isFound = true;
                   break;
                }
            }
            
              if(!isFound){
                 System.out.println("The " + search + " is not found!");
             }
             
            
    }
    
    
    public static void main(String[] args) {
      boolean isRunning = true;
      
      
      while(isRunning){
            System.out.println("1. Add");
        System.out.println("2. Search");
          System.out.println("3. Exit");
        System.out.print("Enter choice: ");   
        int choice = scan.nextInt();
        
        switch(choice){
            case 1 -> insert();
            case 2 -> linearSearch();
            case 3 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE, PLEASE TRY AGAIN!");
        }
      }
     
    }
}
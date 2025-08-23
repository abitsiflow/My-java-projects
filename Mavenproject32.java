/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject32;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject32 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double fnumber;
      double snumber;
      String choice;
      boolean isRunning = true;
      
      while(isRunning){
        System.out.print("Enter first number: ");
        fnumber = scan.nextDouble();
        
        System.out.print("Enter second number: ");
        snumber = scan.nextDouble();
        
        System.out.println("Choices");
        System.out.println("+, - , * , /");
        System.out.println("Exit");
        System.out.print("Select available choice that has been shown: ");
        choice = scan.next().toLowerCase();
        
     
        switch(choice){
            case "+" -> System.out.println("Total: " + add(fnumber,snumber));
            case "-" -> System.out.println("Total: " + sub(fnumber,snumber));
            case "*" -> System.out.println("Total: " + mul(fnumber,snumber));
            case "/" ->{
                if(snumber == 0){
                    System.out.println("Cannot divide to zero");
                }else{
                    System.out.println("Total: " + div(fnumber,snumber)); 
                }
            }
           
            case "exit" ->{
                System.out.println("Exiting...");
                isRunning = false;
            }
            default -> System.out.println("INVALID CHOICE");
        }
    }
      scan.close();
  }
     
    static double add(double  x, double y){
        return  x + y;
    }
    
    static double sub(double  x, double  y){
        return  x - y;
    }
    
    static double mul(double  x, double y){
        return x * y;
    }
    
    static double div(double x, double y){

        return x / y;
    }
}

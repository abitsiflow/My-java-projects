/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject24;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject24 {
    
 static int addition(int x, int y){
        return x + y;
    }
    
    static int subtraction(int x, int y){
        return x - y;
    }
    
    static int multiplication(int x, int y){
        return x * y;
    }
    
    static int division(int x, int y){
        if(y == 0){
            System.out.println("Cannot be divided");
            return 0;
        }
        
        return x / y;
    }
    
   public static void main(String[] args){  
     Scanner scan = new Scanner(System.in);
        String choice;
        int fNumber;
        int lNumber;
        String continuation;
        boolean isRunning = true;
        boolean innerLoop = false;
        
        do{
        System.out.println("***************");
        System.out.println("Calculator");
        System.out.println("***************");
        System.out.print("Enter First Number: ");
        fNumber = scan.nextInt();
        
        System.out.println("+" + "-" + "*" + "/");
        choice = scan.next();
        
        System.out.print("Enter Second Number: ");
        lNumber = scan.nextInt();
        scan.nextLine();
        
        switch(choice){
            case "+" -> {
                System.out.println("Total: " + addition(fNumber,lNumber));
            }
            case "-" -> {
                System.out.println("Total: " + subtraction(fNumber,lNumber));
            }
            case "*" -> {
                System.out.println("Total: " + multiplication(fNumber,lNumber));
            }
            case "/" -> {
                System.out.println("Total: " + division(fNumber,lNumber));
            }
            default -> System.out.println("Invalid Choice");
        }
            
            System.out.println("Do you want to continue? (yes/no)");
            continuation = scan.nextLine().toLowerCase();
            
        }while(continuation.equals("yes"));
            
        scan.close();
   }
}

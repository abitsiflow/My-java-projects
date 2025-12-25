/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject52;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject52 {

    static int add (int x, int y){
        return x + y;
    }
    
    static int sub (int x, int y){
        return x - y;
    }
    
    static int mul(int x, int y){
        return x * y;
    }
    
    static double div (double x, double y){
        return x / y;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int fnum;
        int snum;
        int choice;
        boolean isRunning = true;
        
        while(isRunning){
        System.out.println("**************");
        System.out.println("Simple Calculator (Console)");
        System.out.println("**************");
        
        System.out.print("Enter First Number: ");
        fnum = scan.nextInt();
        
        System.out.println("1. Additional");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your Operators (1-4): ");
        choice = scan.nextInt();
        
        System.out.print("Enter Second Number: ");
        snum = scan.nextInt();
        
        switch(choice){
            case 1 -> {
                System.out.println("Total: " + add(fnum,snum));
            }
            case 2 ->{
                System.out.println("Total: " + sub(fnum,snum));
            }
            case 3 ->{
                System.out.println("Total: " + mul(fnum,snum));
            }
            case 4 ->{
                if(snum == 0){
                    System.out.println("Divisor Cannot be divided by 0");
                }else{
                    System.out.println("Total: " + div(fnum,snum));
                
                }
            }
            default ->{
                System.out.println("Wrong Choice, Try Again!");
            }
        }
        
       }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject40;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject40 {
 static Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {
        double balance = 0;
        int choice;
        int cardNumber;
        boolean verification = false;
        boolean whileLoopVerify = true;
        boolean isRunning = true;
        int attempt = 3;
        
        System.out.println("****************");
        System.out.println("Log In Form");
        System.out.println("****************");
        
       while(whileLoopVerify){
            for(int i = 0; i < 3; i++){
                System.out.println("Enter your ATM number: ");
                cardNumber = scan.nextInt();
            if(cardNumber == 123456789){
                System.out.println("Welcome back, Client!");
                whileLoopVerify = false;
                verification = true;
                break;
            }else{
                 attempt --;
                 System.out.println("Wrong Card Number! Attempts Left: " + attempt);
                 if(attempt == 0){
                    System.out.println("Access Denied. Try insert the card again.");
                     System.exit(0);
                 }
            }
            
        }
    }
        
        while(isRunning){
        System.out.println("******************");
        System.out.println("Bank System");
        System.out.println("******************");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        System.out.println("Choose (1-4)");
        System.out.println("Enter your choice: ");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 -> balance += deposit();
            case 2 -> balance -= withdraw(balance);
            case 3 -> showBalance(balance);
            case 4 -> {
                System.out.println("Thank you for using Bank system. Have A Great Day!");
                isRunning = false;
            }
            default -> System.out.println("Invalid Choice");
        }  
    } 
 }
       
    static void showBalance(double balance){
        System.out.println("Your Balance: " + " $" + balance);
    }
    
    static double deposit(){
        int amount;
        
        System.out.println("How much do you want deposit? ");
        System.out.println("Enter amount: ");
        amount = scan.nextInt();
        
        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }else{
            System.out.println("Deposit Successfully! ");
        }
        
        return amount;
    }
    
    static double withdraw(double balance){
        int amount;
        
        System.out.println("How much do you want to withdraw?");
        System.out.println("Enter amount: ");
        amount = scan.nextInt();
        
        if(amount < 0){
            System.out.println("Amount cannot be withdraw to negative");
            return 0;
        }else if(amount > balance){
            System.out.println("Amount cannot be exceeded with the balance. Try Again.");
           return 0;
        }else{
            System.out.println("Withdraw Successfully!");
        }
        return amount;
    }
}

package mimo.oopbankaccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class bankAccount {
   static Scanner scan = new Scanner(System.in);
    String accountName;
    double balance = 0;


    double deposit(){
        double amount;
        System.out.print("Enter the amount you deposit: ");
        amount = scan.nextDouble();
        
        if(amount < 0){
            System.out.println("amount cannot be negative");
            return 0;
        }else{
            System.out.println("Deposit Successfully");
        }  
        return amount;
    }
    
    double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount you withdraw: ");
        amount = scan.nextDouble();
        
        if(amount < 0){
            System.out.println("cannot be negative");
            return 0;
        }else if(balance < amount){
            System.out.println("insufficient funds ");
        }else{
            System.out.println("Withdraw Successfully");
        }
        
        return amount;
    }
    
    void inBalance(double balance){
        System.out.println("$"+ balance);
                
    }
}

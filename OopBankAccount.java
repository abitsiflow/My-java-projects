/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.oopbankaccount;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class OopBankAccount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bankAccount BA = new bankAccount();
        int choice;
        boolean isRunning = true;
   
            System.out.println("Enter Name: ");
            BA.accountName = scan.nextLine();
            
        while(isRunning){
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. BALANCE");
            System.out.println("4. EXIT");
            System.out.print("CHOOSE 1-4:");
            choice = scan.nextInt();

            switch(choice){
                case 1 -> BA.balance += BA.deposit();
                case 2 -> BA.balance -= BA.withdraw(BA.balance);
                case 3 -> BA.inBalance(BA.balance);
                case 4 -> {
                    System.out.println("Exiting...");
                    isRunning = false;
                }
                default -> System.out.println("Invalid user input. Please try again.");
            }

        }
     
    }
}

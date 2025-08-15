/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject30;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> identification = new Stack<>();
        Stack<String> mail = new Stack<>();
        StackClass sc = new StackClass();
        
        boolean input_validation_for_ID_REGISTER;
        boolean input_validation_for_MAIL_REGISTER;
        boolean isRunning = true;
        String again;
        int id;
        int choice = 0;
        String add;
        String email;
        
        while(isRunning){
        System.out.println("********************");
        System.out.println("EMAIL AND ID REGISTRATION SYSTEM");
        System.out.println("********************");
        System.out.println("1. Register ID");
        System.out.println("2. Register Email");
        System.out.println("3. Exit");
        System.out.print("Pick a choice: ");
        choice = scan.nextInt();
        scan.nextLine();    
        
            switch(choice){
                case 1 -> {  // the case 1 while loop is true
                    input_validation_for_ID_REGISTER = false;
                    while(!input_validation_for_ID_REGISTER){   
                    System.out.print("Enter id: ");
                    id = scan.nextInt();

                    identification.push(id);

                    System.out.print("ID number List: ");
                    System.out.println(identification);
                              
                    System.out.println("Do you want to add? (y/n)");
                    add = scan.next().toLowerCase();
                    scan.nextLine();
                    
                        if(add.equals("y")){
                            input_validation_for_ID_REGISTER = false;
                        }else if(add.equals("n")){
                            input_validation_for_ID_REGISTER = true;
                        }else{
                            System.out.println("Invalid Choice"); 
                         }
                    }
                }
                case 2 -> {
                    input_validation_for_MAIL_REGISTER = false;
                    while(!input_validation_for_MAIL_REGISTER){   
                    System.out.println("Enter Email: ");
                    email = scan.next();
                    
                    mail.push(email);
                    
                    System.out.print("Email Address List: ");
                    System.out.println(mail);
                    
                    System.out.println("Do you want to add? (y/n)");
                    add = scan.next().toLowerCase();
                    scan.nextLine();
                    
                        if(add.equals("y")){
                            input_validation_for_MAIL_REGISTER = false;
                        }else if(add.equals("n")){
                            input_validation_for_MAIL_REGISTER = true;
                        }else{
                            System.out.println("Invalid Choice"); 
                         }
                    }
                }
                case 3 -> {
                    System.out.println("Exiting....");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}

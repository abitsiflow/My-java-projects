/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.arrayss;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Arrayss {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        String student[];
        
        System.out.print("Enter how many slots: ");
        int space = scan.nextInt();
        scan.nextLine();
        student = new String[space];
       
        for(int i = 0; i < student.length; i++){
            System.out.print("Enter student's name:");
            student[i] = scan.nextLine().trim();
            
        }
        
         System.out.println("*******************");
         System.out.println("Student Registered");
         System.out.println("*******************");
         
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i]);
        }
        
        boolean isFound = false;
        
        System.out.println("Find student: ");
        String search = scan.nextLine().trim();
        
        for(int i = 0; i < student.length; i++){
            if(search.equals(student[i])){
                System.out.println("Student found!");
                isFound = true;
                break;
            }
        }
       if(!isFound){
           System.out.println("Student Not Found!");
       }
    }
}
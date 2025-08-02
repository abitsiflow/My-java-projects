/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.studentgradetrackersystem;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class StudentGradeTrackerSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        double grades;
        boolean isRunning = true;
        int choice;
        int put = 0;
        Student[] student = null;
        while(isRunning){
        System.out.println("**************************");
        System.out.println("Sudent Grade Tracker System");
        System.out.println("**************************");
        System.out.println("1. Add Student");
        System.out.println("2. Show All Students");
        System.out.println("3. Exit");
        System.out.print("Choose 1-3:");
        choice = scan.nextInt();
        
        switch(choice){
            case 1 ->{
                System.out.println("How many you want:");
                put = scan.nextInt();
                scan.nextLine();
                student = new Student[put];
                for(int i = 0; i < put; i++){
                System.out.print("Enter name: ");
                name = scan.nextLine();
                
                System.out.print("Enter age: ");
                age = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter grades: ");
                grades = scan.nextDouble();
                scan.nextLine();
                if(grades >= 90.0|| grades >= 80.0 || grades >= 75.0){
                    System.out.println("Passed");              
                }else{
                    System.out.println("Failed");
                }
                   student[i] = new Student(name, (int) grades,age);
                }
          
            }
            case 2 ->{
                if(student == null){
                    System.out.println("No items yet");
                    break;
                }
                for(int i = 0; i < put; i++){
                    student[i].displayStatus();
                }
            }    
            case 3 ->{
                isRunning = false;
                System.out.println("Exiting....");
            }
        }
        }
    }
}

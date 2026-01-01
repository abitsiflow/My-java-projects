/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.studentgrademanager;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StudentGradeManager {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        addGradeOnSubject addGrades = new addGradeOnSubject();
        boolean isRunning = true;
        
        while(isRunning){     
            System.out.println("***********************");
            System.out.println("Student Grade Manager");
            System.out.println("***********************");
            System.out.println("1. Add Student ");
            System.out.println("2. Add Grade per Subject ");
            System.out.println("3. View all students ");
            System.out.println("4. Exit ");
            System.out.print("Enter choice (1-4): ");
            int choice = scan.nextInt();
            scan.nextLine();
            
         
            switch(choice){
                
                case 1 -> student.info();
                
                case 2 -> {
                    boolean case2Running = true; // idk what should i name but it works...
                    while(case2Running){
                        System.out.println("");
                        System.out.println("1. Add Grade");
                        System.out.println("2. Show Grades");
                        System.out.println("3. Exit");
                        int gradeChoice = scan.nextInt();
                        scan.nextLine();
                        
                        switch(gradeChoice){
                            case 1 -> addGrades.addGrade();
                            case 2 ->{
                                addGrades.showGrades();
                            }
                            case 3 -> {
                                System.out.println("Exiting.....");
                                case2Running = false;
                            }
                        }
                        
                    }
                }
                case 3 -> {
                    boolean case3Running = true;
                    while(case3Running){ 
                        System.out.println("");
                        System.out.println("1. Show Names");
                        System.out.println("2. Show Id");
                        System.out.println("3. Show all");
                        System.out.println("4. Exit");
                        System.out.print("Enter Choice(1-4): "); // user has 3 choices to input something
                        int showChoice = scan.nextInt();
                        
                        switch(showChoice){
                            case 1 -> {
                                student.showName();
                            }
                            case 2 ->{
                                student.showId();
                            }
                            case 3 ->{
                                student.showInfo();
                            }
                            case 4 ->{
                                System.out.println("Exiting.....");
                                case3Running = false;
                            }
                            default -> System.out.println("Invalid Choice, Please Try Again!");
                        }

                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using my small program!");
                    isRunning = false;
                }
            }
              
            
     
        }
           
    }
}

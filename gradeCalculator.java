/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.phase1;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class gradeCalculator {  
    Scanner scan = new Scanner(System.in);
    int takeSubjects = 0;
    String list_subjects[] = null;
    static double list_grades[] = null;
    
    void insert_grades(){
       
            System.out.print("Enter how many subjects did you take: ");
        try{
            takeSubjects = scan.nextInt();
            scan.nextLine();

            list_subjects = new String[takeSubjects];
            list_grades = new double[takeSubjects]; 

            for(int i = 0; i < list_subjects.length; i++){
                System.out.print("Enter the name of the subject " + (i+1) + ": ");
                list_subjects[i] = scan.nextLine();

            }

            for(int i = 0; i < list_grades.length; i++){
                System.out.print("Enter the grade of the subject: " + (i+1) + ": ");
                list_grades[i] = scan.nextDouble();
                scan.nextLine();
            }

            for(int i = 0; i < takeSubjects; i++){
                System.out.println("Grades");
                System.out.println("---------------------------------");
                System.out.println(list_subjects[i] + " == " + list_grades[i]);
            }
            
        }catch(Exception e){
            System.out.println("Please Input Properly!");
        }
      
    }
    
    void calculate_average(){
        
       if(list_grades == null){
           System.out.println("No grades yet");
           return;
       }
        
            double sum = 0;
            
        for(int i = 0; i < list_grades.length; i++){
            sum += list_grades[i];
            
           
        }
        System.out.println("Total Grades Computed: " + sum);
        System.out.println("Average: " + sum / takeSubjects);
    }
}

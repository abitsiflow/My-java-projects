/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.studentgrademanager;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class addGradeOnSubject {
    Scanner scan = new Scanner(System.in);
    
    static double [] list_grade = new double[2];
    String[] list_subject = new String[2];
   
    String subject;
    static double grade;
    /*
    String subject;
    static double grade;
    I tried to use this but it makes something redundant because it instead making the variable to put a value it become worse.
    
    In my theory i think because the   double [] list_grade = new double[2]; has the value of 2 then the variables are reproducing 2 same values because its like the function of the list_grade but its just a copy.
    UPDATE: IT STILL MULTIPLY
    
    */
    
    // i need something to calculate whether the student is passed or failed and also that records.
    // now i need something to select the student then input the choice per subject
    // scratch that idea i think i need to learn more about OOP. 
    
    void addGrade(){
       
       for(int i = 0; i < list_subject.length; i++){
            System.out.print("Enter Subject: ");
            subject = scan.nextLine().trim();
       
            System.out.print("Enter Grade: ");
            grade = scan.nextDouble();
            scan.nextLine(); // need this to prevent skipping
            
            System.out.println();
            
         
           
       }
       
         for(int i = 0; i < list_subject.length; i++){
             System.out.println(list_subject[i] + " == " + list_grade[i]);
         }
         
         isPassed();
    }
    
    void showGrades(){
       
        for(int i = 0; i < list_subject.length; i++){
           System.out.println(list_subject[i] + " == " + list_grade[i]); //now i make a to show records 
        }
        
    }
    
    void isPassed(){
        
        for(int i = 0; i < list_grade.length; i++){
        double ave = list_grade[i] + list_grade[i] / 4;
            System.out.println(ave);
            
            if(ave > 75){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }
            
    }

}

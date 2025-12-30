/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.studentgrademanager;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class addGradeOnSubject {
    Scanner scan = new Scanner(System.in);
    
    ArrayList<Double> list_grade = new ArrayList<>(); 
    ArrayList<String> list_subject = new ArrayList<>();
    
    String subject;
    static double grade;
    
    // i need something to calculate whether the student is passed or failed and also that records.
    // now i need something to select the student then input the choice per subject
    // scratch that idea i think i need to learn more about OOP. 
    
    void addGrade(){
        System.out.print("Enter Grade: ");
        grade = scan.nextDouble();
        scan.nextLine(); // need this to prevent skipping
        
        System.out.print("Enter Subject: ");
        subject = scan.nextLine().trim();
        
        list_grade.add(grade);
        list_subject.add(subject); //inputting grades per subject
        
    }
    
    void showGrades(){
        for(double grades : list_grade){
          for(String subjects : list_subject){
            System.out.println(grades + " == " + subjects); //now i make a to show records
         }
        }
    }
    
    void isPassed(){
        for(double passed : list_grade){
            if(passed >= 90){
                System.out.println(" Passed: A");
           }else if(passed >= 80){
                System.out.println(" Passed: B");
           }else if(passed >= 75){
                System.out.println(" Passed: C");
           }else{
                System.out.println(" Failed");
            }
        }
        
        System.out.println("");
        
     
    }
}

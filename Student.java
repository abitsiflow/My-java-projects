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
public class Student {
    addGradeOnSubject addGrades = new addGradeOnSubject();
    Scanner scan = new Scanner(System.in);
    ArrayList <String> list_name = new ArrayList<>();
    ArrayList <String> list_id = new ArrayList<>();
    String name;
    String id;
    String subject;
    
    void info(){
        System.out.print("Enter student's name: ");
        name = scan.nextLine().trim();
        
        System.out.print("Enter id: ");
        id = scan.nextLine().trim();
       
       
        System.out.println("Added Successfully!");
        list_name.add(name);
        list_id.add(id);
        
        // i need something to put on a record.
    }
    
    void showId(){
        for(String ids : list_id){
            System.out.println(ids);
        }
    }
    
    void showName(){
       for(String names : list_name){
           System.out.println(names);
       }
    }
    void showInfo(){
        for(String ids : list_id){
           for(String names : list_name){
            System.out.println(names + " == " + ids);
            
       }
      }
    }
    
}

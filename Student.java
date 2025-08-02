/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimo.studentgradetrackersystem;

/**
 *
 * @author ADMIN
 */
public class Student {
    String name;
    int age;
    double grade;
   
    
    Student(String name,int age, double grade){
        this.name = name;
        this.age = age; 
        this.grade = grade;
    }
    
    void displayStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
    }
    
}

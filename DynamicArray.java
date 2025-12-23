/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.dynamicarray;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list1 = new ArrayList <>(); 
        ArrayList <Integer> list2 = new ArrayList <>(); 
        
        list1.add(50);       
        list1.add(111);
        list1.add(32300);
        
        System.out.println(list1); // trying the basics of arraylist
        
        System.out.println();
        
        System.out.print("Enter the digits you want: ");
        
        for(int i = 0; i < 5; ++i){
           int digit = scan.nextInt();
           list2.add(digit);
           
        }
        System.out.println(list2);
       
       
    }
}

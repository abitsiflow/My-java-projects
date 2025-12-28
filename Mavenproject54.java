/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject54;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Mavenproject54 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //variabless
      boolean isRunning = true;
      boolean isFound = true;
      int num;
      
        System.out.println("Enter how many num you want to put: ");
        num = scan.nextInt();
        scan.nextLine();
      
      int numbers[] = new int[num];
      
      for(int i = 0; i < numbers.length; i++){
          numbers[i] = scan.nextInt();
          scan.nextLine();
      }
      
      for(int i = 0; i < numbers.length; i++){
          System.out.println(numbers[i]);
      }
      
  
        System.out.println("");
    }
}
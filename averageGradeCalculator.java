/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.phase1;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */
public class averageGradeCalculator {

    public static void main(String[] args) {
        gradeCalculator gc = new gradeCalculator();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        boolean mainIsRunning = true;
        
        while(mainIsRunning){
            try{
                System.out.println("Average Grade Calculator");
                System.out.println("-------------------------");
                System.out.println("1. Calculate");
                System.out.println("2. Show Average");
                System.out.println("3. Exit");
                System.out.print("Enter you choice (1-3): ");
                choice = scan.nextInt();
                scan.nextLine();
                
             switch(choice){
                    case 1 ->{
                       gc.insert_grades();
                    }
                    case 2 -> gc.calculate_average();
                    case 3 -> mainIsRunning = false;
                    default -> System.out.println("Invalid choice, Please Try Again");
                }
         
            }catch(InputMismatchException e){
                System.out.println("Please input (1-3) ");
                scan.nextLine();
            }
                
            
        }
         scan.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.primenumber;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        boolean isPrime = true;
        
        System.out.print("Enter a number: ");
        num = scan.nextInt();
        
        if(num < 1){
            isPrime = false;
        }else{
            for(int i = 2; i <= num /2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }      
            }
            
        }
         if(isPrime){
                System.out.println("The " + num + " is Prime number");
            }else{
                System.out.println("The " + num + " is not Prime number");
            }
    }
}

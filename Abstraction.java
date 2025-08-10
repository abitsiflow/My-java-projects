/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.abstraction;

/**
 *
 * @author ADMIN
 */
public class Abstraction {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);
        Motorcycle motor = new Motorcycle("Yamaha","R15",2019);
        
        System.out.println(car);
        car.sound();
        
        System.out.println(motor);
        motor.sound();
    }
}

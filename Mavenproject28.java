/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.mavenproject28;

/**
 *
 * @author ADMIN
 */
public class Mavenproject28 {

    public static void main(String[] args) {
      Animal animal1 = new Animal("Elephant","Frog");
      Animal animal2 = new Animal("Dog","Lizard");
      Animal[] animal = {animal1,animal2};
      
      Car kotse1 = new Car("Honda","Civic", 2001);
      Car kotse2 = new Car("Ford","Ranger", 2008);
      Car kotse3 = new Car("Honda","Vios", 2010);
      
      Car[] car = {kotse1, kotse2, kotse3};
      
      for(int i = 0; i < car.length; i++){
          car[i].displayInfo(); // cprrect form
          System.out.println();
      }
     for(int i = 0; i < animal.length; i++){
         //System.out.println(animal[i]); // YOU CALLED A ONLY VARIABLE, NO VALUE
         animal[i].displayInfo(); // this is the correct form
         System.out.println();
     }
    } 
}

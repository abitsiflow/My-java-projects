/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mimo.queueing;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ADMIN
 */
public class Queueing {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
     
        queue.offer("Miguel");
        queue.offer("Taylor");
        queue.offer("Jessa");
        
        queue.poll();
        
        System.out.println("What name is on the head " + queue.peek());
        System.out.println(queue);
        
        
    }
}

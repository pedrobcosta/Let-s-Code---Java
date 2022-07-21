package Collections;

import java.util.PriorityQueue;

public class App4 {
    
    public static void main(String... args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq1.add(10);
        pq1.add(9);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("Remover o primeiro elemento: " + pq1.poll());
    }
}

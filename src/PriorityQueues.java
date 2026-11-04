import java.util.*;

public class PriorityQueues {
    public static void main(String[] args){
        // Priority Queue = A FIFO data structure that serve elements
        // with the highest priorities first before elements with lower priority

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add("B");
        queue.add("C");
        queue.add("A");
        queue.add("F");
        queue.add("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

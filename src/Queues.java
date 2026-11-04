import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args){

        // Queue = FIFO data structure, First-In First-Out (ex A line of people)
        // A collection designed for holding elements prior to processing
        // Linear data structure

        // add = enqueue, offer()
        // remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.add("Karen");
        queue.add("Chad");
        queue.add("Steve");
        queue.add("Harold");

        System.out.println(queue.isEmpty());

        //System.out.println(queue.peek());
        queue.remove();  // [Chad, Steve, Harold]
        //queue.remove();  [Steve, Harold]
        //queue.remove(); [Harold]
        //queue.remove(); []

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
    }
}

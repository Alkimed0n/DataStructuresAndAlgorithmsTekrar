import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args){

        /* LinkedList: Stores Nodes in 2 parts (data + adress)
         Nodes are in non-consecutive memory locations
         Elements are linked using pointers

                    Node                Node                Node
                [data | adress] -> [data | adress] -> [data | adress]

           Advantages:
           1. Dynamic Data Structure allocates needed memory while running)
           2. Insertion and Deletion of Nodes is easy O(1)
           3. No/Low memory waste

           Disadvantages:
           1. Greater memory usage (additional pointer)
           2. No random access of elements (no index[i])
           3. Accesing/Searching elements is more time consuming O(N)

           Uses:
           1. implement Stacks/Queues
           2. GPS navigation
           3. Music Playlist
         */

        LinkedList<String> linkedList = new LinkedList<String>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
         */
        //Linked List as a Queue
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("F");

        //linkedList.remove();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();


        System.out.println(linkedList);
    }
}

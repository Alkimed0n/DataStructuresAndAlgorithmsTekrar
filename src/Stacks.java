import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //stack = LIFO data structure. (Last-In First-Out
        //        stores objects into a sort of "vertical tower"
        //        push() to add to the top
        //        pop() to remove from the top

    Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");

        System.out.println(stack.isEmpty());

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        //stack.pop();
        //stack.pop();
        //stack.pop();

        //System.out.println(stack);
        //System.out.println(stack.isEmpty());

        stack.push("League of Legends");

        //String myFavGame = stack.pop();

        System.out.println(stack.peek());

        System.out.println(stack);
        System.out.println(stack.search("DOOM"));
        //System.out.println(myFavGame);

        /*for(int i = 0;  i < 1000000000 ; i++){
            stack.push("Fallout76");
        }*/

        System.out.println(stack);

    }
}


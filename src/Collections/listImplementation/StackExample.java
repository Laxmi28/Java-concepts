package Collections.listImplementation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
       /* stack intenally extends vector henec all the methods are by default synchronized --> it is based on lifo approach */

        Stack<Integer> stackExample = new Stack<>();
        stackExample.push(1);
        stackExample.push(2);
        stackExample.push(3);

        System.out.println(stackExample);
        
        System.out.println(stackExample.pop());

        System.out.println(stackExample);
        System.out.println(stackExample.peek());

        System.out.println(stackExample);

        // linked list as stack
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(12);
        list.addLast(13);
        list.addLast(45);

        System.out.println(list.getLast());
        System.out.println(list.removeLast());


        // array list as stack

        ArrayList<Integer>  list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2);
        System.out.println(list2.size() - 1);
    }

}

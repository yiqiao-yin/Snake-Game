import java.util.*;
import java.util.function.Supplier;
  
public class GFG {
    public static void main(String args[])
    {
  
        // For ArrayList
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        System.out.println("ArrayList : " + list.toString());
  
        // For LinkedList
        List<Integer> llist = new LinkedList<Integer>();
        llist.add(2);
        llist.add(4);
        System.out.println("LinkedList : " + llist.toString());
  
        // For Stack
        List<String, Integer> stack = new Stack<String, Integer>();
        stack.add("user");
        stack.add(2);
        System.out.println("Stack : " + stack.toString());
    }
}
import java.util.*;

public class stack_ {
    public static void main(String[] args) {
        /* // ================= STACK ================= //

         LIFO → Last In, First Out

         push() → add to top
         pop()  → remove from top
         peek() → see top

         Array implementation:
         top++ when pushing
         top-- when popping

         Time complexity:
         push → O(1)
         pop  → O(1)
         peek → O(1) */
        Stack<String> stack = new Stack<String>();
        stack.push("Harry");
        stack.push("hermoine");
        stack.push("Ron");
        stack.push("dumbledore");
        stack.push("Hagrid");
        //stack.pop();
        //System.out.println(stack);
        //System.out.println(stack.search("dumbledore"));
        //works on LIFO basis LAST IN FIRST OUT, so dumbledore prints 2.
        //System.out.println(stack.search("richie"));
        //prints -1 if item not present in stack
    }
}

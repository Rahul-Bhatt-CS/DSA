import java.util.Stack;
public class DSA_1_Stacks{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("MineCraft");
        stack.push("Valorant");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("BorderLand");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

//        Methods in java for stacks:
//        stack.push(element);
//        add element to stack
//        stack.pop();
//        remove and get top element;
//        stack.peek();
//        see what is the top element
//        stack.empty();
//        check if the stack is empty
//        stack.search(element);
//        search for an element in the stack
    }
}
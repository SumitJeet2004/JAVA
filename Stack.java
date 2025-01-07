import java.util.ArrayList;

public class Stack {
    private static ArrayList<Integer> list = new ArrayList<>();

    // Check if the stack is empty
    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // Push an element onto the stack
    public static void push(int data) {
        list.add(data);
    }

    // Pop an element from the stack
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;  // Return a sentinel value or throw an exception
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // Peek the top element of the stack
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;  // Return a sentinel value or throw an exception
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        // No need to create an instance of Stack, as everything is static
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println(Stack.pop());  // Output: 30
        System.out.println(Stack.peek()); // Output: 20
    }
}

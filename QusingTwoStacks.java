import java.util.Stack;

public class QusingTwoStacks {
    static class Queue {
        static Stack s1 = new Stack();
        static Stack s2 = new Stack();

        // Check if the queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Push element to the queue
        public static void push(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push the new element to s1
            s1.push(data);

            // Move all elements back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            // Pop the top element from s1 (the front of the queue)
            return (int) s1.pop();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        // Remove and print elements from the queue
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

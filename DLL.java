
public class DLL {
    public class Node {  // Keep Node non-static
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null; // Fixed: set prev instead of next
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // Add to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Print the list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
        
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String args[]) {
        DLL dll = new DLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.print();

        dll.removeFirst();
        dll.print();
        dll.reverse();
        dll.print();
    }

}

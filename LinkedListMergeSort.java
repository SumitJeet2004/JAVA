public class LinkedListMergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Function to add an element at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to get the middle of the linked list
    public Node getMiddle(Node head) {
        if (head == null) {
            return null; // Handle empty list case
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to merge two sorted linked lists
    public Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    // Function to implement merge sort on linked list
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head); // Get middle element
        Node left = head;
        Node right = mid.next;
        mid.next = null; // Split the list into two halves

        Node sortedLeft = mergeSort(left);
        Node sortedRight = mergeSort(right);

        return merge(sortedLeft, sortedRight);
    }

    // Zigzag function
    public void zigzag() {
        // Find the middle of the list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Reverse the second half of the list
        Node curr = mid.next;
        mid.next = null; // Important to break the list
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Merge the two halves in zigzag manner
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            if (nextL == null) break;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedListMergeSort ll = new LinkedListMergeSort();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(43);
        ll.addLast(24);
        ll.addLast(5);

        System.out.println("Original Linked List:");
        ll.printList(head);

        head = ll.mergeSort(head);

        System.out.println("Sorted Linked List:");
        ll.printList(head);

        ll.zigzag();

        System.out.println("Zigzag Linked List:");
        ll.printList(head);
    }
}

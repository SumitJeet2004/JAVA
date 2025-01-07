public class linkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static Node curr;
    public static Node prev;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            addLast(data);
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        if (prev.next == null) { 
            int val = prev.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = prev.next.data;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
                return i;
                }
                temp=temp.next;
               
                i++;
            }
            return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        } 
        int idx = helper(head.next,key);
            if(idx==-1){
                return -1;
        }return idx+1;
    }  
    
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail =head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }
         head = prev;
        }
    
    public void deletenthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if ( n==sz){
            head=head.next;//remove first

            return;
        }
        int i = 1;
        int itoFind=sz-n;
        Node prev = head;
        while(i<itoFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head== null || head.next==null){
            return true;
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfStart = reverseList(slow);

        Node firstHalfEnd = slow;
        Node secondHalfEnd = secondHalfStart;

        while(secondHalfEnd != null){
            if(firstHalfEnd.data != secondHalfEnd.data){
                return false;
            }
            firstHalfEnd = firstHalfEnd.next;
            secondHalfEnd = secondHalfEnd.next;
        }

        // Reverse the second half back to original
        secondHalfStart = reverseList(secondHalfStart);
        return true;
    }

    private Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
   
    

    


    public static void main(String[] args) {
       /* linkedList ll = new linkedList();
        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(3);

        ll.addLast(4);

        ll.add(4, 5);

        ll.print(); // Output: 1 2 5 3 4
        ll.removeFirst();
         ll.print();
        ll.removeLast();
         ll.print();
        System.out.println(ll.itrSearch(2));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
        ll.deletenthFromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());*/
        

    }
}

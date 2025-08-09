package LinkedList;

public class DoublyLinkedList {
    
    // Node definition
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head and Tail
    private Node head;
    private Node tail;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Push at front
    public void pushFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Push at end
    public void pushEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Pop from front
    public int popFront() {
        if (head == null) {
            throw new RuntimeException("List is empty!");
        }
        int value = head.data;
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return value;
    }

    // Print list forward
    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.pushFront(10);
        list.pushFront(20);
        list.pushEnd(30);
        list.printForward(); // Output: 20 <-> 10 <-> 30 <-> null

        System.out.println("Popped front: " + list.popFront()); // Output: 20
        list.printForward(); // Output: 10 <-> 30 <-> null
    }
}

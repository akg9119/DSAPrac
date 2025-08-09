package LinkedList;

public class MyLinkedList {
    public Node head;
    private int size;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public MyLinkedList() {
        this.size = 0;
    }

    // add first,last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deliteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deliteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void listPrint() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public void reverseIteration() {
        if (head == null || head.next == null) {
            return; // No need to reverse if list is empty or has one element
        }
        Node prev = head;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = nextNode; // Move to next node
        }
        head.next = null; // Set the old head's next to null
        head = prev; // Update head to new first node
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty list or single node
        }
        Node newHead = reverseRecursive(head.next); // Reverse the rest of the list
        head.next.next = head; // Make the next node point to the current node
        head.next = null; // Set the current node's next to null
        return newHead; // Return the new head of the reversed list
    }

    public static void main(String[] args) {
        MyLinkedList basic = new MyLinkedList();
        basic.addFirst("a");
        basic.addFirst("is");
        basic.listPrint();

        basic.addLast("list");
        basic.listPrint();

        basic.addFirst("this");
        basic.listPrint();

        basic.deliteFirst();
        basic.listPrint();

        basic.deliteLast();
        basic.listPrint();

        System.out.println("Size of the list: " + basic.getSize());

        basic.addLast("1");
        basic.addLast("2");
        basic.addLast("3");
        basic.addLast("4");

        basic.listPrint();
        basic.reverseIteration();
        System.out.println("Reversed list (iteration):");
        basic.listPrint();
        basic.head = basic.reverseRecursive(basic.head);
        System.out.println("Reversed list (recursive):");
        basic.listPrint();
    }
}
package LinkedList;

public class Detect_Remove_Cycle_Linked_List {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Detect cycle using Floyd's Algorithm
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Found cycle, find the start
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // start of cycle
            }
        }
        return null; // no cycle
    }

    // Detect and remove the cycle if present
    public boolean removeCycle(ListNode head) {
        ListNode startNode = detectCycle(head);
        if (startNode == null) return false; // no cycle

        // Find the last node in cycle
        ListNode ptr = startNode;
        while (ptr.next != startNode) {
            ptr = ptr.next;
        }
        ptr.next = null; // break the cycle
        return true; // cycle removed
    }

    public static void main(String[] args) {
        Detect_Remove_Cycle_Linked_List list = new Detect_Remove_Cycle_Linked_List();
        
        // Create Linked List: 1 -> 2 -> 3 -> back to 2
        ListNode head = list.new ListNode(1, list.new ListNode(2, list.new ListNode(3)));
        head.next.next.next = head.next; // Creating a cycle for testing

        // Detect cycle
        ListNode cycleStart = list.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }

        // Remove cycle
        boolean removed = list.removeCycle(head);
        System.out.println("Cycle removed: " + removed);

        // Verify again
        if (list.detectCycle(head) == null) {
            System.out.println("No cycle after removal.");
        } else {
            System.out.println("Cycle still present.");
        }
    }
}

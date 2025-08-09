package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Copy_List_with_Random_Pointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }

            Map<Node, Node> map = new HashMap<>();

            Node oldTemp = head;
            while (oldTemp != null) {
                Node copyNode = new Node(oldTemp.val);
                map.put(oldTemp, copyNode);
                oldTemp = oldTemp.next;
            }

            oldTemp = head;
            while (oldTemp != null) {
                Node copyNode = map.get(oldTemp);
                copyNode.next = map.get(oldTemp.next);
                copyNode.random = map.get(oldTemp.random);
                oldTemp = oldTemp.next;
            }

            return map.get(head);
        }
    }

    public static void main(String[] args) {
        Copy_List_with_Random_Pointer list = new Copy_List_with_Random_Pointer();
        Solution solution = list.new Solution();

        // Create a linked list with random pointers for testing
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.random = head.next; // 1's random points to 2
        head.next.random = head; // 2's random points to 1
        head.next.next.random = head; // 3's random points to 1

        // Copy the linked list
        Node copiedListHead = solution.copyRandomList(head);

        // Print the copied list
        Node temp = copiedListHead;
        while (temp != null) {
            System.out.println("Node value: " + temp.val + ", Random points to: " + (temp.random != null ? temp.random.val : "null"));
            temp = temp.next;
        }
    }
}

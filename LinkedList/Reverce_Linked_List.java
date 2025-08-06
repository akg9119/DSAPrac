package LinkedList;
public class Reverce_Linked_List {
     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }   

    public static void main(String[] args) {
        Reverce_Linked_List list = new Reverce_Linked_List();
        ListNode head = list.new ListNode(1, list.new ListNode(2, list.new ListNode(3, list.new ListNode(4))));
        ListNode reversedHead = list.reverse(head);
        
        // Print reversed linked list
        ListNode curr = reversedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        
    }
}

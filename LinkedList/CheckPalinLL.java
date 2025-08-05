package LinkedList;

public class CheckPalinLL {
     class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
 public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;

        while(curr != null){
         ListNode next = curr.next;
         curr.next =pre;
         pre= curr;
         curr = next;
        }
        return pre;
    }
    public ListNode findMid(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare =hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode mid = findMid(head);
        ListNode secStart = reverse(mid.next);
        ListNode firstStart = head;
        while(secStart != null){
            if(firstStart.val != secStart.val){
                return false;
            }
            firstStart = firstStart.next;
            secStart = secStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalinLL solution = new CheckPalinLL();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(1);

        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }

}

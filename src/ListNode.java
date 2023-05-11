 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class leetcode {

    public boolean isPalindrome(ListNode head) {
        ListNode temp = reverseList(findMid(head));
        while(temp != null){
            if(head.val != temp.val){
                return false;
            }
            head = head.next;
            temp = temp.next;
        }
        return true;

    }

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode mid){
        if(mid == null || mid.next == null){
            return mid;
        }
        ListNode prev = null;
        ListNode curr = mid;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

    }

}
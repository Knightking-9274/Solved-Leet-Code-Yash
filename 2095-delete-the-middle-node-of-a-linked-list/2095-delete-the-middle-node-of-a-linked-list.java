/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
         ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the node before the middle

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node (slow)
        if (prev != null) {
            prev.next = slow.next;
        } else {
            // If the middle node is the first node
            head = slow.next;
        }

        return head;
        
        
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        
        // Dummy node to help with edge cases
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        
        while (head != null) {
            // If it's a beginning of duplicates sublist 
            // skip all duplicates
            if (head.next != null && head.val == head.next.val) {
                // Move till the end of duplicates sublist
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Skip all duplicates
                prev.next = head.next; 
            } else { // Otherwise, move predecessor
                prev = prev.next; 
            }
            // Move forward
            head = head.next; 
        }
        return dummy.next;
    }
}
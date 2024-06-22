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
    public ListNode removeElements(ListNode head, int val) {
       // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize the current node to head and previous node to dummy
        ListNode current = head;
        ListNode previous = dummy;
        
        // Traverse through the list
        while (current != null) {
            if (current.val == val) {
                // Skip the current node by linking previous node to the next node
                previous.next = current.next;
            } else {
                // Move previous to current node
                previous = current;
            }
            // Move current to the next node
            current = current.next;
        }
        
        // Return the new head of the list, which is dummy.next
        return dummy.next;
    }
}
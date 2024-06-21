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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        // Compute the length of the list
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        
        // Normalize k to avoid unnecessary rotations
        k = k % length;
        if (k == 0) return head;
        
        // Find the new tail (at position length - k - 1) and new head (at position length - k)
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        
        // Rearrange the pointers
        temp.next = head; // old tail points to old head
        newTail.next = null; // new tail points to null
        
        return newHead; // new head is the new head
    }
}

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
    public ListNode insertionSortList(ListNode head) {
        // Step 1: Create a dummy node
        ListNode dummy = new ListNode(0);
        ListNode temp = head;

        // Step 2: Iterate through the original list
        while (temp != null) {
            ListNode next = temp.next; // Store the next node

            // Step 3: Find the correct position in the sorted list
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < temp.val) {
                prev = prev.next;
            }

            // Step 4: Insert the current node into the sorted list
            temp.next = prev.next;
            prev.next = temp;

            // Move to the next node in the original list
            temp = next;
        }

        return dummy.next;
    }
}
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
    public ListNode partition(ListNode head, int x) {
         if (head == null) return null;

        // Create two new dummy heads for two separate lists
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);

        // Two pointers for constructing the new lists
        ListNode before = beforeHead;
        ListNode after = afterHead;

        // Traverse the original list and partition the nodes into before and after lists
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        // Ensure the last node of the 'after' list points to null
        after.next = null;
        // Connect the 'before' list with the 'after' list
        before.next = afterHead.next;

        return beforeHead.next;
    }
}
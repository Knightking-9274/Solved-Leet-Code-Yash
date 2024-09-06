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
    public ListNode modifiedList(int[] nums, ListNode head) {
         // Create a set to store the values from nums for O(1) lookup.
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Create a dummy node to handle edge cases like deleting the head node.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the linked list.
        while (current.next != null) {
            if (numSet.contains(current.next.val)) {
                // If the current node's next node value is in the set, skip it.
                current.next = current.next.next;
            } else {
                // Otherwise, move to the next node.
                current = current.next;
            }
        }

        // Return the modified list starting from dummy.next.
        return dummy.next;
        }
    
}
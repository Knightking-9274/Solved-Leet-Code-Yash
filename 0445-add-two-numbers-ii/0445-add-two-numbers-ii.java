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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        // Push all nodes of l1 to stack1
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        
        // Push all nodes of l2 to stack2
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode head = null;
        int carry = 0;
        
        // Pop elements from stacks and add them
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();
            
            int sum = x + y + carry;
            carry = sum / 10;
            
            // Create a new node with the digit and insert it at the front
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head;
            head = newNode;
        }
        
        return head;
    }
    
}
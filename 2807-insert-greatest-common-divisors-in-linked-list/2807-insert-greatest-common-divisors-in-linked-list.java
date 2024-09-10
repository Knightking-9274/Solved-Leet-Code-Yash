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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        
        ListNode temp = head;
        
        while(temp != null && temp.next != null){
            int n1 = temp.val;
            int n2 = temp.next.val;
            
            int gcd = hcf(n1,n2);
            
            ListNode newNode = new ListNode(gcd);
            
            ListNode nextNode = temp.next;
            
            temp.next = newNode;
            
            newNode.next = nextNode;
            
            temp = temp.next.next;
            
            
        }
        return head;
    }
    private static int hcf(int n1, int n2){
        
    
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    
    }
}
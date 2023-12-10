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
    public ListNode middleNode(ListNode head) {
        // int cnt=0;
        ListNode slow=head;
        ListNode fast=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int x = Solution.count(head);
        
        if(x%2==0){
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
            
        }
        else{
           while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        
    }
    private static int count(ListNode head){
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
            
        }
        return cnt;
        
    }
}
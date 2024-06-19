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
        if(head==null || head.next==null)
            return head;
        HashSet<Integer> hs = new HashSet();
        ListNode prev = head;
        ListNode temp = head;
        while(temp!=null){
            
            if(hs.contains(temp.val)){
                prev.next = temp.next;
                temp = temp.next;
                
            }
            else{
               hs.add(temp.val);
                prev = temp;
                temp = temp.next;
                
            }
            
                
        }
       return head; 
        
    }
}
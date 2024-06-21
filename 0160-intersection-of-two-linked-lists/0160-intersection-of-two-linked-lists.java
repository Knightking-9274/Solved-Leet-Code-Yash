/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null || headB==null) return null;
//         ListNode temp1 = headA;
//         ListNode temp2 = headB;
//         int cntA = 0, cntB = 0, diff=0;
//         while(temp1!=null){
//             cntA++;
//             temp1 = temp1.next;
//         }
//         while(temp2!=null){
//             cntB++;
//             temp2 = temp2.next;
//         }
//         temp1 = headA;
//         temp2 = headB;
//         if(cntB>cntA){
//           diff=cntB-cntA;
//           cntB=0;
//           while(cntB!=diff){
//               temp2 = temp2.next;
//               cntB++;
//           }
//         }
//         else{
//           diff=cntA-cntB;
//           cntA=0;
//           while(cntA!=diff){
//               temp1 = temp1.next;
//               cntA++;
//           }
//         }
//         while(temp1!=null && temp2!=null){
//             if(temp1.equals(temp2))
//                 return temp1;
//             temp1 = temp1.next;
//             temp2 = temp2.next;
//         }
        
//         return null;
//     }
// }
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        // Traverse the lists
        while (temp1 != temp2) {
            // When temp1 reaches the end of list A, redirect it to the head of list B
            // Otherwise, move temp1 to the next node
            temp1 = (temp1 == null) ? headB : temp1.next;
            
            // When temp2 reaches the end of list B, redirect it to the head of list A
            // Otherwise, move temp2 to the next node
            temp2 = (temp2 == null) ? headA : temp2.next;
        }
        
        // Either they meet at the intersection node, or both reach null
        return temp1;
    }
}
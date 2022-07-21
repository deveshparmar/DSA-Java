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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       
        if(head==null || left==right)
            return head;
        
        var dummy = new ListNode(-1,head);
        var prev = dummy;
        ListNode tail = null;
        ListNode temp = null;
        
        for(int i=0;i<left-1;i++)
            prev = prev.next;
        
        tail = prev.next;
        
        for(int i=0;i<right-left;i++){
            temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
        }
       
        return dummy.next;
    }
}

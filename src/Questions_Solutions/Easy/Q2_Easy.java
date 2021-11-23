package Questions_Solutions.Easy;

public class Q2_Easy {
    // iterative way

    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return prev;
    }
    // recursive way

    public ListNode reverseListRecursive(ListNode head){
        ListNode temp = head;
        if(temp==null || temp.next==null){
            return temp;
        }
        ListNode newHead = reverseListRecursive(temp.next);
        temp.next.next=temp;
        temp.next=null;

        return newHead;
    }
}

package Questions_Solutions.Easy;

public class Q7_Easy {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode ans = new ListNode(0);
    ListNode temp = ans;

        while(l1!=null && l2!=null){
        if(l1.val<l2.val){
            temp.next=l1;
            l1=l1.next;
            temp=temp.next;
        }
        else{
            temp.next=l2;
            l2=l2.next;
            temp=temp.next;
        }
    }
        if(l1!=null){
        temp.next=l1;
        l1=l1.next;
        temp=temp.next;
    }
         if(l2!=null){
        temp.next=l2;
        l2=l2.next;
        temp=temp.next;
    }
        return ans.next;
}
}

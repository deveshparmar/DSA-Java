package Questions_Solutions.Easy;

public class Q1_Easy {
    public int getDecimalValue(ListNode head) {

        ListNode temp =reverseLL(head);
        int ans=0;
        int i=0;
        while(temp!=null){
            ans +=(temp.val* Math.pow(2,i));
            i++;
            temp=temp.next;
        }
        return ans;
    }

    public ListNode reverseLL(ListNode node){

        ListNode prevPtr = null;
        ListNode currPtr = node;
        ListNode nextPtr;

        while(currPtr!=null){
            nextPtr = currPtr.next;
            currPtr.next=prevPtr;

            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        return prevPtr;
    }
}

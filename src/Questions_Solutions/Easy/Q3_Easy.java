package Questions_Solutions.Easy;

public class Q3_Easy {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int mid = getSize(temp)/2;
        return getNode(temp,mid);
    }

    public int getSize(ListNode head){
        ListNode temp = head;
        int c =0;

        while(temp!=null){
            temp=temp.next;
            c++;
        }

        return c;
    }

    public ListNode getNode(ListNode node,int idx){
        ListNode temp = node;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
}

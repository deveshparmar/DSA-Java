package DoublyLinkedList;

public class Implementation {
    private Node head;
    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        if(head!=null){
            head.prev=node;
        }
        node.next=head;
        node.prev=null;
        head=node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        System.out.println("front");
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            last = temp;
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("reverse");
        while(last!=null){
            System.out.print(last.data + " -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head==null){
            node.prev=null;
            head = node;
            node.next=null;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        node.next = null;
        temp.next=node;
        node.prev=temp;

    }

    public void insertIdx(int data,int idx){
        Node node = new Node(data);
        Node temp = head;
        if(idx==0){
            insertFirst(data);
            return;
        }else if(idx==getSize()){
            insertLast(data);
            return;
        }else {
            int i=0;
            while (i != idx - 1) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            if(node.next!=null) {
                node.next.prev = node;
            }
        }
    }
    public int getSize() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public void insertAfterNode(int after,int data){
        Node previous = getNodeAtIdx(after);
        if(previous==null){
            System.out.println("dosent exist");
            return;
        }
        Node node = new Node(data);
        node.next = previous.next;
        previous.next = node;
        node.prev= previous;
        if(node.next!=null) {
            node.next.prev = node;
        }

    }
    public Node getNodeAtIdx(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteFirst(){
        int val = head.data;
        head=head.next;
        head.prev=null;
        return val;
    }

    public int deleteLast(){
        Node temp = head;
        if(getSize()<=1){
            return deleteFirst();
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        int val = temp.data;
        temp.prev.next=null;
        return val;
    }

    public int deleteAtIdx(int idx){
        Node temp = head;
        if(idx==0){
            return deleteFirst();
        }
        else if(idx==getSize()-1){
            return deleteLast();
        }
        else{
          Node prev = getNodeAtIdx(idx-1);
          int val = prev.next.data;
          prev.next.next.prev=prev;
          prev.next=prev.next.next;
            return val;
        }
    }

}

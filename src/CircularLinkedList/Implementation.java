package CircularLinkedList;

public class Implementation {
    private Node head;
    private Node tail;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void insertNode(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println("end of Circular ll");
    }

    public void delete(int data){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.data==data){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.data==data){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while (temp!=head);
    }
}

package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        Implementation clist = new Implementation();
        clist.insertNode(15);
        clist.insertNode(1);
        clist.insertNode(56);
        clist.insertNode(33);
        clist.insertNode(47);
        clist.insertNode(82);
        clist.display();
        clist.delete(33);
        clist.delete(82);
        clist.display();
    }
}

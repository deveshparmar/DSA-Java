package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Implementation dlist = new Implementation();
        dlist.insertFirst(5);
        dlist.insertFirst(8);
        dlist.insertFirst(9);
        dlist.insertFirst(15);
        dlist.insertFirst(33);
        dlist.insertFirst(78);
        dlist.insertFirst(99);
        dlist.insertLast(100);
        dlist.insertIdx(900,5);
        dlist.insertAfterNode(3,500);
        dlist.display();
        System.out.println(dlist.deleteFirst());
        dlist.display();
        System.out.println(dlist.deleteLast());
        dlist.display();
        System.out.println(dlist.deleteAtIdx(4));
        dlist.display();
    }

}

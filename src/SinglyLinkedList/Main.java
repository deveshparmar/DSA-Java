package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        Implementation list = new Implementation();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertLast(99);
        list.insertAtIdx(500, 2);

        System.out.println("size - " + list.getSize());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();
        System.out.println("size - " + list.getSize());

        System.out.println(list.deleteLast());
        list.display();
        System.out.println("size - " + list.getSize());

        System.out.println(list.deleteAtIdx(2));
        list.display();
        System.out.println("size - " + list.getSize());
    }
}

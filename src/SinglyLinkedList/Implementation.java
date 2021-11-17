package SinglyLinkedList;

public class Implementation {
    private Node head;
    private Node tail;
    private int size = getSize();

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node getNodeAtIdx(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node getNodeOfVal(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    public void insertAtIdx(int data, int idx) {
        Node node = new Node(data);
        Node temp = head;
        if (idx == 0) {
            insertFirst(data);
            return;
        } else if (idx == getSize()) {
            insertLast(data);
            return;
        } else {
            int i = 0;
            while (i != idx - 1) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (getSize() <= 1) {
            return deleteFirst();
        }
        Node lastSecond = getNodeAtIdx(getSize() - 2);
        int val = tail.data;
        tail = lastSecond;
        tail.next = null;
        return val;
    }

    public int deleteAtIdx(int idx) {
        Node prev = getNodeAtIdx(idx - 1);
        if (idx == 0) {
            return deleteFirst();
        } else if (idx == getSize() - 1) {
            return deleteFirst();
        } else {
            int val = prev.next.data;
            prev.next = prev.next.next;
            return val;
        }
    }
}



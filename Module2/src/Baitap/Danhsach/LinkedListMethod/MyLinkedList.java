package Baitap.Danhsach.LinkedListMethod;


public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        this.head = null;
    }

    public MyLinkedList(Node head) {
        this.head = head;
        this.numNodes = 0;
    }

    public void traserve() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public void add(int index, Object data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index );
        }
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFist(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }


    public boolean remove(Object o) {
        if (head.next.equals(o)) {
            remove(0);
        }else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(o)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList();
        Node temp = head;
        newList.addFist(temp.data);
        temp = temp.next;
        while (temp != null) {
            newList.addLast(temp.data);
            temp = temp.next;
        }
        return newList;
    }

    public boolean contains(Object o) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }



    class Node {

        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return this.data;
        }
    }

}

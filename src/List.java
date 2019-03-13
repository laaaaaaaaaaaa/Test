import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class List {

    int size = 0;
    Node head;

    public Node getHead() {
        return head;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


    }

    public List() {
        head = null;
        size = 0;
    }

    public List(Node head,int size) {
        this.head = head;
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    public void addFirst(int n) {
        head = new Node(n, head);
        size++;
    }

    public void add(int index, int n) {
        assert index < size && index >= 0;
        if (index == 0) {
            addFirst(n);
        } else {
            Node temp = head;
            Node newNode = new Node(n);
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    public void addLast(int n) {

        add(size, n);
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List list = new List();
        while (n-- > 0) {
            list.addLast(scanner.nextInt());
        }
        list.printList();

        Node cur = list.getHead();
        Node pre = null;
        Node reverseHead = null;

        while (cur!=null){
             Node next = cur.next;
             if (next == null){
                 reverseHead = cur;
             }
             cur.next = pre;
             pre = cur;
             cur = next;
        }

        List reverseList = new List(reverseHead,n);
        reverseList.printList();


    }

}

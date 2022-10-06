package net.koonts;

public class LinkedList {

    Node root;

    public void add(int data) {root = addRecurisve(root, data);}

    public Node addRecurisve(Node head, int data) {
        if (head == null) {head = new Node(data);}
        else {
            head.next = addRecurisve(head.next, data);
        }
        return head;
    }

    public void traverseR(Node head) {
        if (!(head == null)) {
            System.out.println(head.data);
            traverseR(head.next);
        }
    }

    public void remove(Node head) {
        if (head != null) {
            remove(head.next);
            if (head.next != null) {
                head.next = null;
            }
        }
    }
    public void delroot() {
        this.root = null;
    }

    public Node removeRecurisve(Node head) {

        return head;
    }


}

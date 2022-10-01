package net.koonts;

public class Tree {
    Node root = null;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node addRec(Node head, int data) {
        if (head==null) {head = new Node(data);}
        if (head.data<data) {
            head.left = addRec(head, data);
        } else if (head.data>data) {
            head.right = addRec(head, data);
        } else {
            return head;
        }
        return head;
    }

    public void add (int data) {
        root = addRec(root, data);
    }

    public boolean findRecursive(Node head, int value) {
        if (head == null) {return false;}
        if (head.data == value) {return true;}
        return value<head.data
                ? findRecursive(head.left, value)
                : findRecursive(head.right, value);
    }
}

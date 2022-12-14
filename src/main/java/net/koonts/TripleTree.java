package net.koonts;

public class TripleTree {
    Node root = null;
    int size = 0;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node addRec(Node head, int data) {
        if (head==null) {head = new Node(data);}
        else {
            if (data < head.data) {
                head.left = addRec(head.left, data);
            } else if (data > head.data) {
                head.right = addRec(head.right, data);
            } else {
                head.center = addRec(head.center, data);
            }
        }
        return head;
    }

    public void add(int data) {
        root = addRec(root, data);
    }

    public boolean findRecursive(Node head, int value) {
        if (head == null) {return false;}
        if (head.data == value) {return true;}
        if (value<head.data) {
            return findRecursive(head.left, value);
        } else if (value> head.data) {
            return findRecursive(head.right, value);
        } else {
            return findRecursive(head.center,value);
        }
//        return value<head.data
//                ? findRecursive(head.left, value)
//                : findRecursive(head.right, value);
    }
    public int getTreeSize(Node head) {
        if (head!=null) {
            size++;
            getTreeSize(head.left);
            getTreeSize(head.center);
            getTreeSize(head.right);
        }
        return size;
    }

    public void traverse(Node head) {
        if (head!=null) {
            traverse(head.left);
            System.out.println(head.data);
            traverse(head.center);
            traverse(head.right);
        }
    }
}

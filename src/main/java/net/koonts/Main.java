package net.koonts;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);

        System.out.println(tree.findRecursive(tree.root, 1));
    }
}
package net.koonts;

public class Main {
    public static void main(String[] args) {
        TripleTree tree = new TripleTree();
        for (int i=0;i<10;i++) {
            tree.add((int) (Math.random() * 10));
        }
//        tree.add(3);
//        tree.add(5);
//        tree.add(6);
//        tree.add(7);
//        tree.add(8);
//        tree.add(9);
//        tree.add(10);
//        tree.add(11);
//        tree.add(12);

        System.out.println(tree.findRecursive(tree.root, 3));
        System.out.println(tree.getTreeSize(tree.root));
        System.out.println(" ");
        tree.traverse(tree.root);

    }
}
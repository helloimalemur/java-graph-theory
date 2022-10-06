package net.koonts;
public class Main {
    public static void main(String[] args) {


        //Linked List
        System.out.println("");
        System.out.println("Linked List");
        LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(1);
        System.out.println("");
        System.out.println("Traversing..");
        linkedList.traverseR(linkedList.root);
        System.out.println("Deleting..");
        linkedList.remove(linkedList.root);
        System.out.println("Traversing..");
        linkedList.traverseR(linkedList.root);
        System.out.println("delroot..");
        linkedList.delRoot();
        System.out.println("");
        System.out.println("Traversing..");
        linkedList.traverseR(linkedList.root);


        ///Binary Tree
        System.out.println("");
        System.out.println("Binary Tree");
        BinaryTree tree = new BinaryTree();
        for (int i=0;i<10;i++) {
            tree.add((int) (Math.random() * 10));
        }
        System.out.println("Root: "+tree.root.data);
        System.out.println(" ");

//        System.out.println(" ");
//        System.out.println(tree.findRecursive(tree.root, 3)); //locate node containing
        System.out.println("Number of children/sub nodes: "+tree.getTreeSize(tree.root));
        System.out.println(" ");
        System.out.println("Traversing..");
        tree.traverse(tree.root); // print node values

        System.out.println(" ");
        tree.removeAll(tree.root); // set all children/ sub nodes to null
        System.out.println(" ");
        System.out.println("Traversing..");
        tree.traverse(tree.root); // print node values


        System.out.println(" ");
        tree.delRoot(tree.root);
        System.out.println("Traversing..");
        tree.traverse(tree.root); // print node values
    }
}



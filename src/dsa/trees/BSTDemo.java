package dsa.trees;

public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(20);
        bst.insert(30);
        bst.insert(15);
        bst.insert(19);
        bst.insert(25);
        bst.insert(35);
//        System.out.println(bst);
        System.out.println("InOrder");
        bst.inOrderTraversal();
        System.out.println("PreOrder");
        bst.preOrderTraversal();
        System.out.println("PostOrder");
        bst.postOrderTraversal();
        System.out.println("Minimal: " + bst.minimal());
        System.out.println("Maximal: " + bst.maximal());
        System.out.println("Exists 35: " + bst.exists(35));
        System.out.println("Exists 40: " + bst.exists(40));
    }

}

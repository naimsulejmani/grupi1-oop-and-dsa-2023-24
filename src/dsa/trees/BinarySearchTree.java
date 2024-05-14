package dsa.trees;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;


    public BinarySearchTree() {
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size;
    }

    public void insert(T value) {
        //krijo nyjen e re
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            root = newNode;
        } else {
            //ruaje referecen e root ne iter, fillo prej root
            Node<T> iter = root;
            while (iter != null) {
                // shko ne anen e djatht
                if (value.compareTo(iter.getData()) > 0) {
                    //nese ana e djatht eshte null vendose nyjen e re
                    if (iter.getRight() == null) {
                        iter.setRight(newNode);
                        break;
                    } else {
                        iter = iter.getRight();
                    }

                } else {
                    //shko ne anene e majt
                    if (iter.getLeft() == null) {
                        iter.setLeft(newNode);
                        break;
                    } else {
                        iter = iter.getLeft();
                    }
                }
            }
        }
        size++;
    }


    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node<T> root) {
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.println(root);
        inOrder(root.getRight());
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(Node<T> root) {
        if (root == null) return;
        System.out.println(root);
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(Node<T> root) {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root);
    }

    /*
        search, exist
        minimumNode
        maximumNode
        treeSuccessor
        delete ?

     */


}



















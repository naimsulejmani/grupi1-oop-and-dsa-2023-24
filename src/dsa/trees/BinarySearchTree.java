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

    public T minimal() {
//        if (isEmpty()) return null;
//        Node<T> iter = root;
//        while (iter.getLeft() != null) {
//            iter = iter.getLeft();
//        }
//        return iter.getData();
        return minimal(root).getData();
    }

    private Node<T> minimal(Node<T> iter) {
        if (iter == null) return null;
        while (iter.getLeft() != null) {
            iter = iter.getLeft();
        }
        return iter;
    }

    public T maximal() {
//        if (isEmpty()) return null;
//        Node<T> iter = root;
//        while (iter.getRight() != null) {
//            iter = iter.getRight();
//        }
//        return iter.getData();
        return maximal(root).getData();
    }

    private Node<T> maximal(Node<T> iter) {
        if (iter == null) return null;
        while (iter.getRight() != null) {
            iter = iter.getRight();
        }
        return iter;
    }

    public boolean exists(T value) {
        if (isEmpty()) return false;
        return search(root, value) != null;
    }

    private Node<T> search(Node<T> iter, T value) {
        if (iter == null || iter.getData().compareTo(value) == 0) return iter;
        else if (iter.getData().compareTo(value) > 0)
            return search(iter.getLeft(), value);
        else return search(iter.getRight(), value);
    }

    private Node<T> treeSuccessor(Node<T> iter) {
//        return minimal(iter.getRight());
        return maximal(iter.getLeft());
    }


    public T delete(T value) {
        if (isEmpty()) return null;
        // nese eshte nyje gjethe bane null menihere

        //nese eshte vlera me e vogel se root
        //shko ne anen e majte, nese ska femije fshije root->left->null
        //nese ka nje femij, root dergon tek femija
        //nese ka dy femij, perdore treeSuccessor -

        //nese eshte vlera ma e madhe se root
        //shko ne anen e djatht, nese ska femije root->right->null
        //nese ka nje femij, root dergon tek femija
        //nese ka dy femij, perdore treeSuccessor
    }





    /*
        search, exist
        minimumNode
        maximumNode
        treeSuccessor
        delete ?

     */


}



















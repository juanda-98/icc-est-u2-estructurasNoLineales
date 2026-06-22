package structures.trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        this.root = node;
    }

    //Anadir
    public void add(T i) {
        Node<T> node = new Node<T>(i);
        root = addRecursivo(root, node);
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsetar) {
        if(actual == null) {
            return nodeInsetar;
        }
        
        // if(actual.getValue() > nodeInsetar.getValue()) {
        if(actual.getValue().compareTo(nodeInsetar.getValue()) > 0) {
            // izquierda
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsetar));
        }else {
            actual.setRight(addRecursivo(actual.getRight(), nodeInsetar));
        }
        return actual;
    }
    //Pre-Order
    public void preOrden() {
        preOrdenRecursivo(root);
    }
    
    private void preOrdenRecursivo(Node<T> actual) {
        if(actual == null) return;
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }


    //Pos-Order
    public void posOrden() {
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<T> actual) {
        if(actual == null) return;
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual);
    }

    //InOrde
    public void inOrder() {
        inOrderRecursivo(root);
    }


    private void inOrderRecursivo(Node<T> actual) {
        if(actual == null) return;
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrderRecursivo(actual.getRight());
    }

    //Altura del arbol
    public int getHeight() {
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<T> actual) {
        if(actual == null) return 0;
        int heightLeft = getHeightRecursivo(actual.getLeft());     
        int heightRight = getHeightRecursivo(actual.getRight());     
        
        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;

    }


    //Peso del arbol
    public int getWeight() {
        return getWeightRecursivo(root);
    }

    private int getWeightRecursivo(Node<T> actual) {
        if(actual == null) return 0;
        int heightLeft = getWeightRecursivo(actual.getLeft());     
        int heightRight = getWeightRecursivo(actual.getRight());     
        
        return heightLeft + heightRight + 1;
    }

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimir el árbol:");
        printTreeRecursivo(root, 0);

    }


    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) return;
        
        printTreeRecursivo(actual.getRight(), nivel + 1);
        
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }

    public void invertirTree(Node<Integer> root) {
        System.out.println("Imprimir el árbol:");
        printTreeRecursivo(root, 0);

    }

    private void invertirTreeRecursivo(Node<T> actual, int nivel) {
    if (actual == null) return;

    invertirTreeRecursivo(actual.getLeft(), nivel + 1);  // ← izquierdo primero

    for (int i = 0; i < nivel; i++) {
        System.out.print("\t");
    }
    System.out.println(actual.getValue());

    invertirTreeRecursivo(actual.getRight(), nivel + 1); // ← derecho después
}
}

package structures.trees;

import structures.node.Node;

//CLASE DE ARBOL SOLO DE ENTEROS
public class InTree {
    
    private Node<Integer> root;

    //CONTRUCTOR
    public InTree() {
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(int value) {
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }

    //Anadir
    public void add(int i) {
        Node<Integer> node = new Node<Integer>(i);
        root = addRecursivo(root, node);
    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsetar) {
        if(actual == null) {
            return nodeInsetar;
        }
        
        if(actual.getValue() > nodeInsetar.getValue()) {
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
    
    private void preOrdenRecursivo(Node<Integer> actual) {
        if(actual == null) return;
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }


    //Pos-Order
    public void posOrden() {
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<Integer> actual) {
        if(actual == null) return;
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual);
    }

    //InOrde
    public void inOrder() {
        inOrderRecursivo(root);
    }


    private void inOrderRecursivo(Node<Integer> actual) {
        if(actual == null) return;
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrderRecursivo(actual.getRight());
    }

    //Altura del arbol
    public int getHeight() {
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<Integer> actual) {
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

    private int getWeightRecursivo(Node<Integer> actual) {
        if(actual == null) return 0;
        int heightLeft = getWeightRecursivo(actual.getLeft());     
        int heightRight = getWeightRecursivo(actual.getRight());     
        
        return heightLeft + heightRight + 1;
    }

}
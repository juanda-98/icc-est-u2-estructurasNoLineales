package structures.node;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    //CREO UN NODO
    // INSTANCIO EL NODE -> CONSTRUCTOR
    //TIENE QUE CREARSE CON EL VALOR

    public Node(T value2) {
        this.value = value2;
    }



    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node [" + value + "]";
    }
    

}

package ejercicios;

import structures.node.Node;

public class Ejercicio2 {
    public Node<Integer> invertTree(Node<Integer> root) {
        if (root == null) return null;
        // intercambiar hijos
        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        // invertir subárbol izquierdo
        invertTree(root.getLeft());

        // invertir subárbol derecho
        invertTree(root.getRight());
        return root;
    }
}

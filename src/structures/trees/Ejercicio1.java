package structures.trees;

import structures.node.Node;

public class Ejercicio1 extends BinaryTree<Integer> {
    public void insert(int[] numeros) {
        //CREAMOS ARBOL DE ENTEROS
        //INSERTAR CADA NUMERO
        //IMPRIMIR EL ARBOL

        BinaryTree<Integer> arbol = new BinaryTree<>();
        for(int numero : numeros) {
            arbol.add(numero);
        }
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
    
}

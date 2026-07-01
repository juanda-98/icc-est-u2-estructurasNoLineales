package ejercicios;

import structures.trees.BinaryTree;

public class Ejercicio1 {
    public void insert (int[] numeros) {
        //CREAMOS ARBOL DE ENTEROS
        //INSERTAR CADA NUMERO
        //IMPRIMIR EL ARBOL

        BinaryTree<Integer> arbol = new BinaryTree<>();
        for(int numero : numeros) {
            arbol.add(numero);
        }

        System.out.println("---In-Order---");
        arbol.inOrder();

        arbol.printTree();
    }
    
}

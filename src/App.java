import java.util.List;

import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.InTree;

public class App {
    public static void main(String[] args) throws Exception {
        runInTree();
        runBinaryTree();
        runejercicios();
    }

    private static void runejercicios() {
        System.out.println("=== Ejercicio 1 ===");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);

        System.out.println("=== Ejercicio 2 === ");
        BinaryTree<Integer> arbol = new BinaryTree<>();
        arbol.add(4);
        arbol.add(2);
        arbol.add(7);
        arbol.add(1);
        arbol.add(3);
        arbol.add(6);
        arbol.add(9);
        arbol.printTree();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.invertTree(arbol.getRoot());
        arbol.printTree();

        System.out.println("=== Ejercicio 3 ===");
        Ejercicio3 ejercicio3 = new Ejercicio3();
        List<List<Integer>> levels = ejercicio3.listLevels(arbol.getRoot());

        for (int i = 0; i < levels.size(); i++) {
            System.out.println(levels.get(i));
        }

        System.out.println("=== Ejercicio 4 ===");
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println(ejercicio4.profundidadArbol(arbol));


    }

    private static void runBinaryTree() {
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 30));
        

    }

    private static void runInTree() {
        
        InTree arbolNumero = new InTree();
        // Node<Integer> node1 = new Node<>(50);
        // Node<Integer> node2 = new Node<>(10);
        // Node<Integer> node3 = new Node<>(30);

        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);
        arbolNumero.add(60);
        arbolNumero.add(75);
        arbolNumero.add(55);
       
        System.out.println("---Pre-Order---");
        arbolNumero.preOrden();
        System.out.println("---Pos-Order---");
        arbolNumero.posOrden();
        System.out.println("---In-Order---");
        arbolNumero.inOrder();
    }
}

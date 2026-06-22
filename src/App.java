import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.InTree;

public class App {
    public static void main(String[] args) throws Exception {
        runInTree();
        runBinaryTree();
        runejercicio();
    }

    private static void runejercicio() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);
        
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

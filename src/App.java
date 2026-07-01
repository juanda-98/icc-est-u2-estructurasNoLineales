import java.util.List;
import java.util.Set;

import collections.Sets;
import collections.maps.Maps;
import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import ejercicios.Ejercicio4;
import eva.PersonaController;
import eva.Persona;
import models.Contacto;
// import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.InTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runInTree();
        // runBinaryTree();
        // runEjercicios();
        // runSets();
        runEva();
    }

    private static void runEva() {
        PersonaController personaController = new PersonaController();
        Persona[] = personas;
        personaController.filtrarYOrdenar(personas, 18);
    }

    private static void runSets() {
        Sets sets = new Sets();
        
        // implementacion -> HashSet hashcode
        System.out.println("* HashCode:");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contains 'F': " + hashSet.contains("F"));

        // implementacion -> LinkedHashSet
        System.out.println("* LinkedHashSet: ");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size: " + lSet.size());
        System.out.println("Contains 'F': " + lSet.contains("F"));
        
        // implementacion -> TreeSet
        System.out.println("* TreeSet: ");
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Size: " + treeSet.size());
        System.out.println("Contains 'F': " + treeSet.contains("F"));
        
        // implementacion -> ContactoSet
        System.out.println("* ContactoSet: ");
        Set<Contacto> contactoSet = sets.contruirHashSetContacto();
        System.out.println(contactoSet);
        System.out.println("Size: " + contactoSet.size());
        System.out.println("Contains 'Juan Perez': " + contactoSet.contains(new Contacto("Juan", "Perez", "123456789")));
        
        // implementacion -> TreeContactoSet
        System.out.println("* TreeContactoSet: ");
        Set<Contacto> treeContactoSet = sets.construirTreeSetContacto();
        System.out.println(treeContactoSet);
        System.out.println("Size: " + treeContactoSet.size());
        System.out.println("Contains 'Juan Perez': " + treeContactoSet.contains(new Contacto("Juan", "Perez", "123456789")));
        
        // implementacion de mapa
        System.out.println("* Mapas: ");
        Maps maps = new Maps();
        maps.construirHashMap();
        maps.cTreeMap();

    
    }

    private static void runEjercicios() {
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

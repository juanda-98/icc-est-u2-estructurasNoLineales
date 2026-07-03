package structures.grafos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import structures.node.Node;

// trees
// 1 nodo que apunta a root; ref a izq y der
public class Graph<T> {
    
    Map<Node<T>, Set<Node<T>>> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public void add (T value) {
        Node<T> node = new Node<>(value);
        nodes.putIfAbsent(node, new HashSet<>());   
    }
    
    // agrega una conexion bidireccional
    public void addEdge(T v1, T v2) {
        Node<T> nV1 = new Node<>(v1);
        Node<T> nV2 = new Node<>(v2);
        add(v1);
        add(v2);
        nodes.get(nV1).add(nV2);
        nodes.get(nV2).add(nV1);
    }
    
    // agrega una conexion unidireccional
    public void addEdgeUni(T v1, T v2) {
        Node<T> nV1 = new Node<>(v1);
        Node<T> nV2 = new Node<>(v2);
        add(v1);
        add(v2);
        nodes.get(nV1).add(nV2);

    }

    public void print() {
        for(Map.Entry<Node<T>, Set<Node<T>>> entry : nodes.entrySet()) {
            System.out.print(entry.getKey() + "->");
            for(Node<T> node : entry.getValue()) {
                System.out.print(node);
            }
            System.out.println();
        }
    }    

    public void removeEdge(T v1, T v2) {
        Node<T> nV1 = new Node<>(v1);
        Node<T> nV2 = new Node<>(v2);
        if (nodes.containsKey(nV1) && nodes.containsKey(nV2)) {
            nodes.get(nV1).remove(nV2);
            nodes.get(nV2).remove(nV1);

        }
    }

    public void removeNode(T v) {
        Node<T> node = new Node<>(v);
        //Eliminar el nodo como key
        nodes.remove(node);
        // Eliminar las referencias a este nodo en los demás nodos
        for (Set<Node<T>> vecino : nodes.values()) {
            vecino.remove(node);
        }
    }

    public int getDirecciones() {
        Set<String> visitados = new HashSet<>();
    int total = 0;

    for (Map.Entry<Node<T>, Set<Node<T>>> entry : nodes.entrySet()) {
        T v1 = entry.getKey().getValue();
        for (Node<T> vecino : entry.getValue()) {
            T v2 = vecino.getValue();

            String clave = v1 + "-" + v2;
            String claveInversa = v2 + "-" + v1;

            if (visitados.contains(clave) || visitados.contains(claveInversa)) {
                continue; // ya se contó esta arista (era bidireccional)
            }

            visitados.add(clave);
            total++;
        }
    }

    return total;
    }

    public int getConecciones() {
        int total = 0;
    for (Set<Node<T>> vecino : nodes.values()) {
        total += vecino.size();
    }
    return total;
    }


}

package structures.grafos.implementations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import structures.grafos.Graph;
import structures.grafos.PathFinder;
import structures.grafos.PathResult;
import structures.node.Node;

public class DFSPathFinder<T> implements PathFinder<T>{

    @Override
    public PathResult<T> find(Graph<T> graph, T star, T end) {
        Set<T> visitados = new HashSet<>();
        Set<T> path = new HashSet<>();
        boolean encontrado = dfs(graph, star, end, visitados, path);

        if(!encontrado) {
            path.clear();
        }

        return new PathResult<>(new ArrayList<>(visitados), new ArrayList<>(path));
    }

    private boolean dfs(Graph<T> graph, T currente, T end,Set<T> visitados, Set<T> path) {

        visitados.add(currente);        
        path.add(currente);

        Node<T> nC = new Node<>(currente);
        Node<T> nE = new Node<>(end);
        
        if(nC.equals(nE)) {
            return true;
        }

        for(Node<T> vecino : graph.getVecinos(currente)) {
            if(!visitados.contains(vecino.getValue())) {
                boolean encontrado = dfs(
                        graph, 
                        vecino.getValue(), end, 
                        visitados, path);
                if(encontrado) {
                    return true;
                }
            }
        }
        path.remove(currente);
        
        return false;
        
    }

}

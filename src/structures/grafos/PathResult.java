package structures.grafos;

import java.util.List;

public class PathResult<T> {
    private final List<T> visitados;
    private final List<T> path;
    public PathResult(List<T> visitados, List<T> path) {
        this.visitados = visitados;
        this.path = path;
    }
    public List<T> getVisitados() {
        return visitados;
    }
    public List<T> getPath() {
        return path;
    }
    
    @Override
    public String toString() {
        String pathStr = path.isEmpty() ? "\nNo se encontro un camino entre nodos" : "\npath: " + path.toString();
        return "PathResult \nvisitados=" + visitados + pathStr;
        
    }
    
    
}

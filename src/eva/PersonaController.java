package eva;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral) {

        Set<Persona> personasFiltradas = new TreeSet<>(
            (p1, p2) -> {
                int compE = Integer.compare(p2.getEdad(), p1.getEdad());
                if (compE != 0) {
                    return 0;
                }
                int compN = p1.getNombre(). compareToIgnoreCase(p2.getNombre());
                return compN;
        });
        for (Persona p : personas) {
            if (p.getEdad() >= edadUmbral) {
                personasFiltradas.add(p);
            }
        }
        return personasFiltradas;

    }

    // public Map<String, Set<String>> agruparPorEdad(List<Persona>) {
    //     String nombre = "Juan Perez";
    //     nombre.split(" "); // donde se encuentra un espacio divide en un arreglo de palabras
        
    //     String pNombre = nombre.split(" ")[0];

    //     return null;
    // }
}


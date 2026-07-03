package eva;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PersonaController {
    public Set<PersonaEva> filtrarYOrdenar(List<PersonaEva> personas, int edadUmbral) {

        Set<PersonaEva> personasFiltradas = new TreeSet<>(
            (p1, p2) -> {
                int compE = Integer.compare(p2.getEdad(), p1.getEdad());
                if (compE != 0) {
                    return compE;
                }
                int compN = p1.getNombre(). compareToIgnoreCase(p2.getNombre());
                return compN;
        });
        for (PersonaEva p : personas) {
            if (p.getEdad() >= edadUmbral) {
                personasFiltradas.add(p);
            }
        }
        return personasFiltradas;

    }

    public Map<String, Set<String>> agruparPorEdad(List<PersonaEva> personas) {
        Map<String, List<String>> resultado = new TreeMap<>();
        for (PersonaEva p : personas) {
            String pNombre = p.getNombre().split(" ")[0];
            
        }
        List<PersonaEva> personasE = new ArrayList<>();
    personas.add(new PersonaEva("Juan Pérez", 25));    
    personas.add(new PersonaEva("Juan Morales", 27));    
    personas.add(new PersonaEva("Ana López", 45));  
    personas.add(new PersonaEva("pedro alvarez", 35));   
    personas.add(new PersonaEva("Sofía Ramos", 19));

        return null;
    }
}


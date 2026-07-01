package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Sets() {
    }
    
    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> lSet = new LinkedHashSet<>();
        lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");
        return lSet;
    }

    public Set<String> construirTreeSet() {
         Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");
        return treeSet;
    }

    public Set<Contacto> contruirHashSetContacto() {
        Set<Contacto> CSet = new HashSet<>();
        // CSet.add(new Contacto("Juan", "Perez", "123456789"));
        // CSet.add(new Contacto("Ana", "Gomez", "987654321"));
        // CSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        // CSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        // CSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        // CSet.add(new Contacto("Juan", "Lopez", "123456789"));

        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");

        CSet.add(c1);
        CSet.add(c2);
        CSet.add(c3);
        CSet.add(c4);
        CSet.add(c5);
        CSet.add(c6);

        return CSet;

    }

    public Set<Contacto> construirTreeSetContacto() {
        Set<Contacto> tCSet = new TreeSet<>(
            (c1, c2) -> {
                int compN = c1.getNombre().compareTo(c2.getNombre());
                if(compN != 0) return compN;
                int compA = c1.getApellido().compareTo(c2.getApellido());
                return compA;
            });
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");

        tCSet.add(c1);
        tCSet.add(c2);
        tCSet.add(c3);
        tCSet.add(c4);
        tCSet.add(c5);
        tCSet.add(c6);

        return tCSet;
    }

    

}

# Informe sobre Estructuras No Lineales (Arboles Binarios)
## Datos
- Nombre: Juan Cedillo
- Curso: Estructura de Datos
- Fecha: 24 de Junio de 2026
---
Este proyecto implementa estructuras de datos no lineales , específicamente árboles binarios. El proyecto está organizado por paquetes que separa los modelos, las estructuras base y los ejercicios prácticos.

Se desarrollaron cuatro ejercicios que cubren las operaciones fundamentales sobre árboles binarios: inserción, inversión , recorrido por niveles y cálculo de profundidad máxima.

## Árbol Binario

Un árbol binario es una estructura de datos en la que cada nodo tiene a lo sumo dos hijos: el hijo izquierdo y el hijo derecho. El nodo superior se denomina raíz y los nodos sin hijos se denominan hojas.

### Recorridos Aplicados

#### Pre-Order
Comienza desde la raíz primero, visita el nodo actual antes que sus hijos. El orden es: raíz → izquierda → derecha
#### Pos-Order
Va la raíz al último y visita el nodo actual después de sus hijos. El orden es: izquierda → derecha → raíz
#### In-Order
Va al izquierda primero luego visita el nodo actual entre sus dos subárboles. El orden es: izquierda → raíz → derecha

### Altura y Peso
**Altura**: número de aristas en el camino más largo desde la raíz hasta una hoja. Un árbol de un solo nodo tiene altura 1

**Peso**: número total de nodos del árbol

## Desarrollo
### Nodo Generico
La clase Node<'T'> representa la unidad mínima del árbol. Almacena un valor de tipo genérico T y referencias al hijo izquierdo y derecho. Al usar genéricos el mismo nodo puede contener enteros cadenas u objetos personalizados sin modificar la clase

### Clase BinaryTree<'T'> — Árbol Binario de Búsqueda Genérico

Es la clase central del proyecto. Implementa un BST genérico con la restricción T extends Comparable<T>, lo que obliga a que el tipo de dato soporte comparación mediante el método compareTo().

### Clase InTree — Árbol de Enteros

Versión no genérica de BinaryTree que opera exclusivamente con Integer. Implementa los mismos algoritmos pero usa el operador > en lugar de compareTo(). Se usa en el App.java para demostrar los tres recorridos clásicos con el conjunto {50, 10, 30, 60, 75, 55}.
## COMPLEJIDAD

| Operación | Caso Promedio | Peor Caso 
|---|---|---
| `inOrder()`, `preOrden()`, `posOrden()` | O(n) | O(n)
| `getHeight()` | O(n) | O(n) 
| `getWeight()` | O(n) | O(n) 
| `invertTree()` | O(n) | O(n) 
| `listLevels()` | O(n) | O(n)
| `printTree()` | O(n) | O(n) 

## Conclusion
Esta practiva se vio que los árboles binarios de búsqueda son una estructura de datos versátil y eficiente y la potencia depende en la combinación de tres elementos: la propiedad de orden que garantiza la organización jerárquica de los datos, la recursión como herramienta natural para operar sobre ellos, y el uso de genéricos que permite una única implementación reutilizable para cualquier tipo de dato comparable. A través de los cuatro ejercicios se puso en práctica el espectro completo de operaciones —inserción, transformación estructural, recorrido en anchura y medición de profundidad— evidenciando que el diseño orientado a objetos y la separación de responsabilidades no solo facilitan la escritura del código, sino también su mantenimiento y extensión.



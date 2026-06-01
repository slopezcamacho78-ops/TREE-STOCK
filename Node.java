/**
 * Representa un nodo del árbol binario de búsqueda.
 * Cada nodo contiene un producto (ID y nombre) y enlaces
 * a sus hijos izquierdo y derecho.
 */
public class Node {
    int id;
    String name;
    @SuppressWarnings("unused")
    Node left;  // Puntero al subárbol izquierdo (IDs menores)
    @SuppressWarnings("unused")
    Node right; // Puntero al subárbol derecho (IDs mayores)

    /**
     * Constructor del nodo.
     * @param id   Identificador único del producto
     * @param name Nombre del producto
     */
    public Node(int id, String name) {
        this.id    = id;
        this.name  = name;
        this.left  = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + name;
    }
}

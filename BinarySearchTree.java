/**
 * Árbol Binario de Búsqueda (ABB) para gestionar productos por ID.
 * Propiedad: subárbol izquierdo tiene IDs menores, derecho tiene IDs mayores.
 * NO usa ninguna librería de colecciones de Java.
 */
public class BinarySearchTree {
    private Node root; // Raíz del árbol

    // Nodo interno para el ABB
    private static class Node {
        int id;
        String name;
        Node left, right;

        Node(int id, String name) {
            this.id = id;
            this.name = name;
            this.left = this.right = null;
        }

        @Override
        public String toString() {
            return "ID=" + id + " | " + name;
        }
    }

    public BinarySearchTree() {
        this.root = null;
    }

    // ----------------------------------------------------------------
    // INSERT — Inserción recursiva
    // ----------------------------------------------------------------
    public void insert(int id, String name) {
        root = insertRec(root, id, name);
    }

    /**
     * Recorre el árbol comparando IDs hasta encontrar una posición vacía.
     * @param current Nodo actual del recorrido
     * @param id      ID del nuevo producto
     * @param name    Nombre del nuevo producto
     * @return        Nodo actualizado para mantener los enlaces correctos
     */
    private Node insertRec(Node current, int id, String name) {
        if (current == null) {
            // Posición vacía: crear y colocar el nuevo nodo
            System.out.println("✅ Producto registrado: ID=" + id + " | " + name);
            return new Node(id, name);
        }
        if (id < current.id) {
            current.left  = insertRec(current.left,  id, name); // Ir a la izquierda
        } else if (id > current.id) {
            current.right = insertRec(current.right, id, name); // Ir a la derecha
        } else {
            System.out.println("⚠️  Ya existe un producto con el ID " + id + ". No se insertó.");
        }
        return current;
    }

    // ----------------------------------------------------------------
    // SEARCH — Búsqueda por ID
    // ----------------------------------------------------------------
    public boolean search(int id) {
        Node result = searchRec(root, id);
        if (result != null) {
            System.out.println("🔍 Producto encontrado → " + result);
            return true;
        }
        System.out.println("❌ No existe ningún producto con ID " + id + ".");
        return false;
    }

    /**
     * Desciende por el árbol comparando el ID buscado con el nodo actual.
     * @param current Nodo actual
     * @param id      ID a buscar
     * @return        Nodo si se encuentra, null en caso contrario
     */
    private Node searchRec(Node current, int id) {
        if (current == null)    return null;          // No encontrado
        if (id == current.id)   return current;       // Encontrado
        return id < current.id
            ? searchRec(current.left,  id)            // Buscar en izquierda
            : searchRec(current.right, id);           // Buscar en derecha
    }

    // ----------------------------------------------------------------
    // INORDER — Recorrido inorden (izquierda → raíz → derecha)
    // Produce los productos ordenados de menor a mayor ID.
    // ----------------------------------------------------------------
    public void inorder() {
        if (root == null) {
            System.out.println("⚠️  El inventario está vacío.");
            return;
        }
        System.out.println("\n📦 INVENTARIO (ordenado por ID):");
        System.out.println("--------------------------------");
        inorderRec(root);
        System.out.println("--------------------------------");
    }

    private void inorderRec(Node current) {
        if (current != null) {
            inorderRec(current.left);                 // Subárbol izquierdo
            System.out.println("  " + current);      // Nodo actual
            inorderRec(current.right);                // Subárbol derecho
        }
    }
}

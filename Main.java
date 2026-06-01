import java.util.Scanner;

/**
 * Clase principal de Tree-Stock.
 * Menú interactivo en consola para gestionar el inventario
 * usando un Árbol Binario de Búsqueda (ABB).
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree inventory = new BinarySearchTree();
        int option;

        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   🌳  TREE-STOCK  🌳             ║");
        System.out.println("║  Sistema de Inventario con ABB   ║");
        System.out.println("╚══════════════════════════════════╝");

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (Inorden)");
            System.out.println("3. Buscar Producto por ID");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            option = leerEntero(scanner);

            switch (option) {
                case 1 -> registrarProducto(scanner, inventory);
                case 2 -> inventory.inorder();
                case 3 -> buscarProducto(scanner, inventory);
                case 0 -> System.out.println("👋 Saliendo de Tree-Stock...");
                default -> System.out.println("❌ Opción inválida. Intente de nuevo.");
            }

        } while (option != 0);
        }
    }

    /**
     * Solicita ID y nombre del producto, luego lo inserta en el ABB.
     */
    private static void registrarProducto(Scanner scanner, BinarySearchTree inventory) {
        System.out.print("ID del producto (número entero): ");
        int id = leerEntero(scanner);
        if (id < 0) {
            System.out.println("❌ ID inválido.");
            return;
        }
        System.out.print("Nombre del producto: ");
        String name = scanner.nextLine().trim();
        inventory.insert(id, name);
    }

    /**
     * Solicita un ID y realiza la búsqueda en el ABB.
     */
    private static void buscarProducto(Scanner scanner, BinarySearchTree inventory) {
        System.out.print("ID a buscar: ");
        int id = leerEntero(scanner);
        if (id < 0) {
            System.out.println("❌ ID inválido.");
            return;
        }
        inventory.search(id);
    }

    /**
     * Lee un número entero de forma segura desde consola.
     * @return Entero leído, o -1 si la entrada no es válida.
     */
    private static int leerEntero(Scanner scanner) {
        try {
            String line = scanner.nextLine().trim();
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

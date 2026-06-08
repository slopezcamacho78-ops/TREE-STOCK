# Tree-Stock — Sistema de Inventario con ABB

## Objetivo
Implementar un sistema de clasificación de productos usando un **Árbol Binario de Búsqueda** en Java, demostrando:
- Estructuras dinámicas con punteros (referencias entre nodos).
- Recorrido **inorden** para listar productos ordenados por ID.
- Búsqueda eficiente O(log n) en promedio.

## Estructura del Proyecto
```
TreeStock/
├── Node.java               → Nodo del árbol (id, name, left, right)
├── BinarySearchTree.java   → ABB con insert, search, inorder
├── Main.java               → Menú interactivo en consola
└── README.md               → Este archivo
```

## Métodos implementados en BinarySearchTree
| Método | Descripción |
|---|---|
| `insert(id, name)` | Inserta un producto respetando la propiedad del ABB |
| `search(id)` | Busca un producto por ID — O(log n) promedio |
| `inorder()` | Lista todos los productos ordenados de menor a mayor ID |

## Instrucciones de Ejecución

### Requisitos
- JDK Eclipse Temurin 17+
- VS Code con extensión Java

### Pasos
```bash
# 1. Clonar el repositorio
git clone https://github.com/tuusuario/TREESTOCK.git

# 2. Entrar a la carpeta
cd TreeStock

# 3. Compilar
javac *.java

# 4. Ejecutar
java Main
```

## Ejemplo de Ejecución
```
╔══════════════════════════════════╗
║         TREE-STOCK               ║
║  Sistema de Inventario con ABB   ║
╚══════════════════════════════════╝

===== MENÚ PRINCIPAL =====
1. Registrar Producto
2. Mostrar Inventario (Inorden)
3. Buscar Producto por ID
0. Salir
Opción: 1
ID del producto: 30
Nombre del producto: Leche
Producto registrado: ID=30 | Leche

Opción: 2
 INVENTARIO (ordenado por ID):
--------------------------------
  ID: 10 | Nombre: Arroz
  ID: 30 | Nombre: Leche
  ID: 50 | Nombre: Pan
--------------------------------
```

## Capturas de Pantalla
>(
<img width="439" height="218" alt="Insercion" src="https://github.com/user-attachments/assets/b02caac8-71ca-4c31-8771-d714d5da5774" />
<img width="430" height="164" alt="Busqueda" src="https://github.com/user-attachments/assets/0354ff3f-6fee-4d71-8ce6-10c9324f7feb" />
)

## Video de Sustentación
> []

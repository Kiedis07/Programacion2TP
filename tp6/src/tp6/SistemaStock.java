/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Fede
 */
public class SistemaStock {
    package com.utn.tp6;

public class SistemaStock {

    public static void main(String[] args) {
        // Creamos la instancia principal
        Inventario inventario = new Inventario();

        // 1. Crear y agregar 5 productos [cite: 81]
        System.out.println("--- 1. Agregando Productos ---");
        inventario.agregarProducto(new Producto("A001", "Arroz Kilo", 1800.50, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E001", "Mouse inalámbrico", 2700.00, 20, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("R001", "Remera Lisa", 2500.00, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H001", "Lámpara LED", 1200.00, 40, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("A002", "Fideos 500g", 900.00, 60, CategoriaProducto.ALIMENTOS));

        // 2. Listar todos los productos [cite: 82]
        inventario.listarProductos();

        // 3. Buscar un producto por ID [cite: 83]
        System.out.println("\n--- 3. Buscando Producto 'E001' ---");
        Producto buscado = inventario.buscarProductoPorId("E001");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar por categoría ALIMENTOS [cite: 84]
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto y listar [cite: 85]
        System.out.println("\n--- 5. Eliminando Producto 'R001' ---");
        inventario.eliminarProducto("R001");
        inventario.listarProductos();

        // 6. Actualizar stock [cite: 86]
        System.out.println("\n--- 6. Actualizando Stock de 'A001' ---");
        inventario.actualizarStock("A001", 55); // Había 50, actualizamos a 55

        // 7. Mostrar total de stock [cite: 87]
        System.out.println("\n--- 7. Total de Stock ---");
        inventario.obtenerTotalStock();

        // 8. Obtener producto con mayor stock [cite: 88]
        inventario.obtenerProductoConMayorStock(); // Debería ser Fideos (60)

        // 9. Filtrar por precio ($1000 y $3000) [cite: 89]
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles [cite: 90]
        inventario.mostrarCategoriasDisponibles();
    }
}
}

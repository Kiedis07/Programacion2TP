/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Fede
 */
public class Inventario {
    package com.utn.tp6;

import java.util.ArrayList;

/**
 * Gestiona una colección de Productos (ArrayList) y provee métodos
 * para administrarlos. [cite: 68-70]
 */
public class Inventario {
    
    // Atributo principal: una lista dinámica de Productos 
    private ArrayList<Producto> productos;

    public Inventario() {
        // Inicializamos la lista en el constructor
        this.productos = new ArrayList<>();
    }

    // --- Métodos Requeridos  ---

    // 1. agregarProducto [cite: 71]
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }

    // 2. listarProductos [cite: 72]
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n--- Listado Completo de Productos ---");
        // Usamos un for-each como sugiere el marco teórico [cite: 9]
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }

    // 3. buscarProductoPorId [cite: 73]
    // Este método es auxiliar, lo usaremos en otros (como eliminar o actualizar)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // Retorna null si no lo encuentra
    }

    // 4. eliminarProducto [cite: 74]
    public void eliminarProducto(String id) {
        Producto pParaEliminar = buscarProductoPorId(id);
        if (pParaEliminar != null) {
            this.productos.remove(pParaEliminar);
            System.out.println("Producto '" + pParaEliminar.getNombre() + "' eliminado.");
        } else {
            System.out.println("Error: No se encontró el producto con ID '" + id + "'.");
        }
    }

    // 5. actualizarStock [cite: 75]
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto pParaActualizar = buscarProductoPorId(id);
        if (pParaActualizar != null) {
            pParaActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + pParaActualizar.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("Error: No se encontró el producto con ID '" + id + "'.");
        }
    }

    // 6. filtrarPorCategoria [cite: 76]
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- Productos de la Categoría: " + categoria + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay productos en esta categoría.");
        }
    }

    // 7. obtenerTotalStock [cite: 77]
    public void obtenerTotalStock() {
        int stockTotal = 0;
        for (Producto p : this.productos) {
            stockTotal += p.getCantidad();
        }
        System.out.println("El stock total de todos los productos es: " + stockTotal + " unidades.");
    }

    // 8. obtenerProductoConMayorStock [cite: 78]
    public void obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        Producto productoMaxStock = this.productos.get(0);
        for (Producto p : this.productos) {
            if (p.getCantidad() > productoMaxStock.getCantidad()) {
                productoMaxStock = p;
            }
        }
        
        System.out.println("\n--- Producto con Mayor Stock ---");
        productoMaxStock.mostrarInfo();
    }

    // 9. filtrarProductosPorPrecio [cite: 79]
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n--- Productos entre $" + min + " y $" + max + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }

    // 10. mostrarCategoriasDisponibles [cite: 79]
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- Categorías Disponibles ---");
        // .values() es un método estático de los enums que devuelve un array de todos sus valores
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + ": " + cat.getDescripcion());
        }
    }
}
}

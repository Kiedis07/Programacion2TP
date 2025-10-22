/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Fede
 */
public class Producto {
    package com.utn.tp6;

/**
 * Modela un Producto con sus atributos: id, nombre, precio, cantidad y categoría.
 * [cite: 26-32]
 */
public class Producto {
    // Atributos 
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor para inicializar el producto
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // --- Getters (para obtener valores) ---
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    // --- Setter (para modificar valores, ej: actualizar stock) ---
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Muestra en consola la información del producto. 
     */
    public void mostrarInfo() {
        System.out.println("--- Información del Producto ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Cantidad en Stock: " + this.cantidad);
        System.out.println("Categoría: " + this.categoria + " (" + this.categoria.getDescripcion() + ")");
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Fede
 */
public class CategoriaProducto {
    package com.utn.tp6;


public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"), // [cite: 50]
    ELECTRONICA("Dispositivos electrónicos"), // [cite: 51]
    ROPA("Prendas de vestir"), // [cite: 52]
    HOGAR("Artículos para el hogar"); // [cite: 53]

    // Atributo para la descripción [cite: 54]
    private final String descripcion;

    /**
     * Constructor del enum 
     */
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion; // [cite: 56]
    }

    
    public String getDescripcion() {
        return descripcion; // [cite: 60]
    }
}
    
}

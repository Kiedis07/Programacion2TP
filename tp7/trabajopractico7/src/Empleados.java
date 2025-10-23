/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class Empleados {
    package trabajopractico7;

/**
 * Clase abstracta: Empleado [cite: 30]
 */
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    // Método abstracto para calcularSueldo [cite: 30]
    public abstract double calcularSueldo();
}
}

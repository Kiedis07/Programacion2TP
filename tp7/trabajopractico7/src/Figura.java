/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class Figura {
    package trabajopractico7;

/**
 * Clase abstracta: Figura [cite: 28]
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto[cite: 12]. No tiene cuerpo, obliga a las subclases
    // a implementarlo.
    public abstract double calcularArea(); [cite: 28]

    public String getNombre() {
        return nombre;
    }
}
}

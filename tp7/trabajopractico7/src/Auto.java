/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class Auto {
    package trabajopractico7;

/**
 * Subclase: Auto [cite: 25]
 * Hereda de Vehiculo usando 'extends' [cite: 12]
 */
public class Auto extends Vehiculo {
    
    private int cantidadPuertas;

    // Constructor que llama al constructor de la superclase (Vehiculo)
    // usando 'super()' [cite: 12]
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Llama al constructor de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura del método [cite: 12]
    @Override
    public void mostrarInfo() {
        // Llama primero al método original de la superclase
        super.mostrarInfo(); 
        // Agrega la información específica de Auto
        System.out.println("Puertas: " + this.cantidadPuertas);
    }
}
}

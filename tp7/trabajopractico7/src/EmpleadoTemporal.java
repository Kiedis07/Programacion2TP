/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class EmpleadoTemporal {
    package trabajopractico7;

/**
 * Subclase: EmpleadoTemporal [cite: 31]
 */
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}
}

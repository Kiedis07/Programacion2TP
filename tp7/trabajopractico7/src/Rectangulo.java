/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class Rectangulo {
    package trabajopractico7;

/**
 * Subclase: Rectangulo [cite: 28]
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
}

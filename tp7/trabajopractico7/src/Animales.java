/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class Animales {
    package trabajopractico7;

/**
 * Clase base: Animal [cite: 34]
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String hacerSonido() { [cite: 34]
        return "Sonido genérico de animal";
    }

    public void describirAnimal() { [cite: 34]
        // Este método usa 'hacerSonido()'
        // Gracias al polimorfismo, llamará a la versión
        // sobrescrita de cada subclase.
        System.out.println(this.nombre + " hace: " + this.hacerSonido());
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
class Titular {

    private void setPasaporte(Pasaporte aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public class Pasaporte {
    private String numero;
    private String fechaEmision;

    // 1. Relación de COMPOSICIÓN (Parte "fuerte" de la relación) 
    // El objeto Foto se suele crear junto con el Pasaporte (o en su constructor).
    private Foto foto; 

    // 2. Relación de ASOCIACIÓN BIDIRECCIONAL con Titular 
    private Titular titular;

    // Constructor que inicializa ambas relaciones
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        // Inicializa la COMPOSICIÓN: Crea la Foto (no puede existir sin el Pasaporte)
        this.foto = new Foto(imagenFoto, formatoFoto); 
        
        // Inicializa la ASOCIACIÓN
        this.titular = titular;
        
        // Establece la otra dirección de la ASOCIACIÓN BIDIRECCIONAL
        // para que el Titular también sepa a qué Pasaporte pertenece
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }

    // Métodos Getters y Setters
    // ...
}
    
}

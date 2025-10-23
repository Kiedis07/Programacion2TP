/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Fede
 */
public interface Cliente {
    // Archivo: Cliente.java
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        // Simulación de envío de email
        System.out.println("ENVIANDO EMAIL a " + this.email);
        System.out.println("Cliente: " + this.nombre + ". Mensaje: " + mensaje);
    }
}
}

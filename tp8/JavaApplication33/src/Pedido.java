/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede
 */
public class Pedido {
    // Archivo: Pedido.java
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    // Agregaremos al cliente y estado en el paso 5
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        setEstado("Iniciado"); // Estado inicial
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificamos al cliente sobre el cambio de estado
        if (this.cliente != null) {
            this.cliente.notificar("El pedido cambió a estado: " + this.estado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // Llama al calcularTotal() de cada producto
        }
        return total;
    }
}
}

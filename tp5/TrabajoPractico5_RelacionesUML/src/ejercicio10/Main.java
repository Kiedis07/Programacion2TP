/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Fede
 */
public class Main {
    package ejercicio10_cuentabancaria_claveseguridad_titular;

public class Main {
    public static void main(String[] args) {
        // Crear Titular
        Titular titular = new Titular("María Lopez", "50123456");
        
        // Crear Cuenta Bancaria (con composición interna de ClaveSeguridad)
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 50000.0);
        
        // Establecer relación bidireccional
        cuenta.setTitular(titular);
        
        System.out.println("=== EJERCICIO 10 ===");
        System.out.println("Cuenta Bancaria - CBU: " + cuenta.getCbu());
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("DNI: " + cuenta.getTitular().getDni());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        System.out.println("Última modificación clave: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        
        // Verificar relación bidireccional
        System.out.println("\n--- Verificación Relación Bidireccional ---");
        System.out.println("Titular tiene cuenta: " + (titular.getCuentaBancaria() != null));
        System.out.println("¿Es la misma cuenta?: " + (titular.getCuentaBancaria() == cuenta));
        
        // Probar funcionalidad de seguridad
        System.out.println("\n--- Prueba de Seguridad ---");
        System.out.println("Clave correcta (1234): " + cuenta.verificarAcceso("1234"));
        System.out.println("Clave incorrecta (9999): " + cuenta.verificarAcceso("9999"));
        
        // Probar transacción
        System.out.println("\n--- Prueba de Transacción ---");
        cuenta.realizarTransaccion(1000.0, "1234");  // Éxito
        cuenta.realizarTransaccion(100000.0, "1234"); // Falla por saldo
        cuenta.realizarTransaccion(1000.0, "9999");  // Falla por clave
        
        // Demostrar composición
        System.out.println("\n--- Composición ---");
        System.out.println("ClaveSeguridad creada automáticamente con CuentaBancaria: " + (cuenta.getClaveSeguridad() != null));
    }
}
}

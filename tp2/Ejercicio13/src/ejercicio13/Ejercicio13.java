public class Ejercicio13 {
    
    // Función recursiva para mostrar precios
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosRecursivo(precios, indice + 1);
        }
    }
    
    public static void main(String[] args) {
        // a. Declarar e inicializar array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales recursivamente
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        // c. Modificar precio específico
        precios[2] = 129.99;
        
        // d. Mostrar valores modificados recursivamente
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
}
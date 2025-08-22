public class Ejercicio12 {
    public static void main(String[] args) {
        // a. Declarar e inicializar array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // c. Modificar precio específico (tercer producto)
        precios[2] = 129.99;
        
        // d. Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
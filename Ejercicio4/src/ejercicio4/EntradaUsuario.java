import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();
            
            System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        }
    }
}
import java.util.Scanner;

public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORRECCIÓN: nextLine() en lugar de nextInt()
        
        System.out.println("Hola, " + nombre);
        
        scanner.close();
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un año: ");
            int año = scanner.nextInt();
            
            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                System.out.println("El año " + año + " es bisiesto.");
            } else {
                System.out.println("El año " + año + " no es bisiesto.");
            }
        }
    }
}
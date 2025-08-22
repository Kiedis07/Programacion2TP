import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Con enteros (resultado truncado)
        int divisionEntera = num1 / num2;
        System.out.println("División con enteros: " + divisionEntera);
        
        // Con doubles (resultado preciso)
        double divisionDouble = (double) num1 / num2;
        System.out.println("División con doubles: " + divisionDouble);
        
        scanner.close();
    }
}
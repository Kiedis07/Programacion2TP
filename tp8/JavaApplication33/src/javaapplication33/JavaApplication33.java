/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author Fede
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dentro del main
try {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el dividendo: ");
    int num1 = sc.nextInt();
    System.out.print("Ingrese el divisor: ");
    int num2 = sc.nextInt();

    if (num2 == 0) {
        
        throw new ArithmeticException("División por cero detectada manualmente.");
    }
    
    double resultado = (double) num1 / num2;
    System.out.println("El resultado es: " + resultado);

} catch (ArithmeticException e) {
    System.err.println("Error: No se puede dividir por cero.");
    
} catch (java.util.InputMismatchException e) {
    System.err.println("Error: Debe ingresar números enteros.");
}
    }
    
}

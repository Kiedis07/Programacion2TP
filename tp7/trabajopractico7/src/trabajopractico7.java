package trabajopractico7;

// Importamos las clases necesarias para las listas
import java.util.ArrayList;
import java.util.List;

public class TrabajoPractico7 {

    public static void main(String[] args) {
        
        System.out.println("--- INICIO DEL TRABAJO PRÁCTICO 7 ---");

        // --- Tarea 1: Vehículos ---
        // Instanciar un auto y mostrar su información [cite: 26]
        System.out.println("\n--- Kata 1: Vehículos y herencia básica ---");
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();

        // --- Tarea 2: Figuras geométricas ---
        // Crear un array de figuras y mostrar el área de cada una [cite: 28]
        System.out.println("\n--- Kata 2: Figuras geométricas y métodos abstractos ---");
        
        // Creamos un array de la clase base 'Figura' (Upcasting [cite: 12])
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Círculo 1", 10.0);
        figuras[1] = new Rectangulo("Rectángulo 1", 5.0, 8.0);

        // Usamos polimorfismo[cite: 12]: Java sabe qué 'calcularArea()' llamar
        for (Figura fig : figuras) {
            System.out.println("Área de " + fig.getNombre() + ": " + fig.calcularArea());
        }

        // --- Tarea 3: Empleados ---
        // Crear lista de empleados, invocar calcularSueldo() polimórficamente
        // y usar instanceof [cite: 32]
        System.out.println("\n--- Kata 3: Empleados y polimorfismo ---");
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 50000.0));
        empleados.add(new EmpleadoTemporal("Luis", 80, 500.0));
        empleados.add(new EmpleadoPlanta("Maria", 55000.0));

        for (Empleado emp : empleados) {
            // 1. Invocación polimórfica de calcularSueldo()
            System.out.println("Empleado: " + emp.getNombre() + " - Sueldo: $" + emp.calcularSueldo());

            // 2. Uso de 'instanceof' para clasificar [cite: 12, 32]
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("   (Tipo: Empleado de Planta)");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("   (Tipo: Empleado Temporal)");
            }
        }

        // --- Tarea 4: Animales ---
        // Crear lista de animales y mostrar sus sonidos [cite: 35]
        System.out.println("\n--- Kata 4: Animales y comportamiento sobrescrito ---");
        
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Fido"));
        animales.add(new Gato("Misi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Animal("Serpiente")); // Usará el método base

        // Polimorfismo: 'describirAnimal()' llama al 'hacerSonido()'
        // que corresponda (al de Perro, Gato, Vaca o Animal) [cite: 12]
        for (Animal ani : animales) {
            ani.describirAnimal();
        }
        
        System.out.println("\n--- FIN DEL TRABAJO PRÁCTICO 7 ---");
    }
}
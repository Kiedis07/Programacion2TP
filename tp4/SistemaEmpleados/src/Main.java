public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===\n");
        
        // Crear empleados usando ambos constructores
        Empleado emp1 = new Empleado(1, "Ana García", "Desarrolladora", 2500.0);
        Empleado emp2 = new Empleado("Luis Martínez", "Diseñador");
        Empleado emp3 = new Empleado("Marta Rodríguez", "Tester");

        // Mostrar información de cada empleado
        System.out.println("--- Empleados creados ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        // Aplicar aumentos de salario
        System.out.println("\n--- Aplicando aumentos de salario ---");
        emp1.actualizarSalario(10); // 10% de aumento
        emp2.actualizarSalario(200); // 200 de aumento fijo

        // Mostrar salarios actualizados
        System.out.println("Despues de los aumentos:");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        // Mostrar total de empleados
        System.out.println("\n--- Resumen ---");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // Contador estático

    // Constructor 1: Recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador
    }

    // Constructor 2: Solo nombre y puesto asigna id automatico y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // Id automatico basado en el total
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++; // Incrementa el contador
    }

    // metodo sobrecargado 1: Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // metodo sobrecargado 2: Aumento por cantidad fija
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // metodo toString()
    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto + " | Salario: $" + salario;
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters (encapsulamiento)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
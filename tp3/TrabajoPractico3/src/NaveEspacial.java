public class NaveEspacial {
    public String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    public void despegar() {
        System.out.println(nombre + " despegó.");
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("Avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades.");
        } else {
            System.out.println("No se puede superar el límite de 100.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}